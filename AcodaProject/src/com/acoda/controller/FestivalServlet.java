package com.acoda.controller;

import java.util.List;

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
import com.acoda.dao.FestivalDAO;
import com.acoda.vo.FestivalVO;

@Controller
@RequestMapping("/festival")
public class FestivalServlet {

	@Autowired
	FestivalBIZ festivalBIZ;

	//list�����ִ°�.
	@RequestMapping("/select.do")
	public String f_Select(Model m) {
		List<FestivalVO> all = festivalBIZ.getAllFestival();

		m.addAttribute("all", all);
		return "festival/list_festival";

	}
	//insert
	@RequestMapping(value ="/insert.do", method=RequestMethod.GET)
	public ModelAndView f_insert(@ModelAttribute FestivalVO vo) {
		System.out.println("����� �μ�Ʈ �߰��ϴ� ��");
		int r = festivalBIZ.getInsertFestival(vo);
		InternalResourceView irv = new InternalResourceView("/festival/select.do");
		return new ModelAndView(irv);

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
	public ModelAndView Festival_delete(@RequestParam("del_name") String name) {
		System.out.println("���� ��Ʈ�ѷ� ����Ʈ");
		InternalResourceView irv = new InternalResourceView("/festival/select.do");

		int r = festivalBIZ.getDelFestival(name);
		if (r > 0) {
			System.out.println("��������� �´�");
			return new ModelAndView(irv);
		} else {
			System.out.println("��������");
			return null;
		}
	}
	//���ε�
	@RequestMapping(value = "/find.do", method = RequestMethod.GET)
	public ModelAndView Festival_find(@RequestParam("find_number") String find_number, Model m) {
		System.out.println("����� ���ε�" + find_number);
		FestivalVO v = festivalBIZ.getFindFestival(find_number);
		m.addAttribute("find", v);
		
		InternalResourceView irv = new InternalResourceView("/input/update.jsp");
		ModelAndView mav=new ModelAndView(irv);
		return mav;
	}
	//������Ʈ
	@RequestMapping(value="/update.do")
	public ModelAndView Festival_update(@ModelAttribute("festivalvo") FestivalVO vo) {
		System.out.println("����� ������Ʈ");
		
		int f = festivalBIZ.getUpdateFestival(vo);
		InternalResourceView irv = new InternalResourceView("/festival/select.do");
		return new ModelAndView(irv) ;
	}
	//�˻�
	@RequestMapping(value="/search.do",method=RequestMethod.GET)
 public String search(HttpServletRequest request,Model m) {
		String s=request.getParameter("searchkeyword");
		List<FestivalVO> list= festivalBIZ.getsearch(s);
		
	 System.out.println("����� ��ġ");
		
		m.addAttribute("list",list);
		
		
	return "festival/getboardList";
	}

	

}
