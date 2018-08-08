package com.acoda.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import com.acoda.biz.FestivalBIZ;
import com.acoda.vo.FestivalVO;

@Controller
@RequestMapping("/festival")
public class FestivalServlet {

	@Autowired
	FestivalBIZ festivalBIZ;

	//list�����ִ°�.
	@RequestMapping("/select.do")
	public String f_Select(Model m) {
		m.addAttribute("all", festivalBIZ.getAllFestival());
		return "festival/list_festival";		
	}
	//insert
	@RequestMapping(value ="/insert.do", method=RequestMethod.GET)
	public String f_insert(@ModelAttribute FestivalVO vo) {
		System.out.println("����� �μ�Ʈ �߰��ϴ� ��");
		festivalBIZ.getInsertFestival(vo);
		return "redirect:/festival/select.do";
	}
	//insert�������� �Ѿ
	@RequestMapping("/insert_page.do")
	public ModelAndView Festival_insertpage() {
		System.out.println("���⼭ �Ѿ�°ǰ�?");
		InternalResourceView irv = new InternalResourceView("/input/input_festival.jsp");
		return new ModelAndView(irv);
	}

	//����
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public ModelAndView Festival_delete(@RequestParam("del_number") String name) {
		System.out.println("���� ��Ʈ�ѷ� ����Ʈ");
		InternalResourceView irv = new InternalResourceView("/festival/select.do");
		if (festivalBIZ.getDelFestival(name) > 0) {
			System.out.println("��������� �´�");
			return new ModelAndView(irv);
		} else {
			System.out.println("��������");
		return null;	
		}
	}
	//���ε�
	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public ModelAndView Festival_find(@RequestParam("find_number") String f_number,Model m) {
		System.out.println("����� ���ε�" + f_number);
		FestivalVO v = festivalBIZ.getFindFestival(f_number);
		//m.addAttribute("find",v);	
		InternalResourceView irv = new InternalResourceView("/input/update_festival.jsp");
		return new ModelAndView(irv,"find",v);
	}
	//������Ʈ
	@RequestMapping(value="update.do",method=RequestMethod.POST)
	public ModelAndView Festival_update(@ModelAttribute FestivalVO vo) {
		System.out.println("����� ������Ʈ ����");
	    festivalBIZ.getUpdateFestival(vo);
		InternalResourceView irv = new InternalResourceView("/festival/select.do");
		ModelAndView mav=new ModelAndView(irv);
		return mav;
	}
	
	//�˻�
	@RequestMapping(value="/search.do",method=RequestMethod.GET)
 public ModelAndView search(HttpServletRequest request) {
		String s=request.getParameter("searchkeyword");
	    System.out.println("����� ��ġ");
		ModelAndView m =new ModelAndView("/festival/list_festival","all",festivalBIZ.getsearch(s));
	return m;
	}

	@RequestMapping(value="/click.do",method=RequestMethod.GET)
	public String festival_click(@RequestParam("click_number") String name ,Model m) {
		 System.out.println("����� Ŭ�� ��Ʈ�ѷ�"+festivalBIZ.getClickfestival(name).size());
		m.addAttribute("click", festivalBIZ.getClickfestival(name));
		return "festival/click_festival";
	}
}
