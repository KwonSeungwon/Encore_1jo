package com.acoda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import com.acoda.biz.BuyBIZ;
import com.acoda.biz.ProductBIZ;
import com.acoda.vo.BuyVO;
import com.acoda.vo.FestivalVO;
import com.acoda.vo.MemberVO;
import com.acoda.vo.Post_BoardVO;
import com.acoda.vo.ProductVO;

@Controller
@RequestMapping("/buy")
public class BuyServlet {

	@Autowired
	BuyBIZ buyBIZ;
	@Autowired
	ProductBIZ productBIZ;

	// 주문 상품 조회
	@RequestMapping("/UserOrderList.do")
	public ModelAndView Buy_Select(HttpSession session, HttpServletResponse response) throws IOException { // 컨트롤러 매개변수는
																											// 뷰단에서 변수를
																											// 받아와야함.

		MemberVO mvo = (MemberVO) session.getAttribute("login");
		int unumber = mvo.getUser_number();
		ModelAndView mav = new ModelAndView();

		if (unumber > 0) {
			List<BuyVO> all = buyBIZ.BuyAllSelectBiz(unumber);
			mav = new ModelAndView("/UserOrder/UserOrderList", "BuyList", all);

		} else {
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
			out.println("alert('Error! you have no item!');");
			out.println("history.back();");
			out.println("</script>");
		}
		return mav;

	}
/*신청서 양식으로 이동은 productServlet에서 함
	@RequestMapping(value ="/insert.do", method=RequestMethod.GET)
	public String f_insert(@ModelAttribute FestivalVO vo) {
		System.out.println("여기는 인서트 추가하는 곳");
		int r = festivalBIZ.getInsertFestival(vo);
		return "redirect:/festival/select.do";
	}
	@RequestMapping(value="/click.do",method=RequestMethod.POST)
	public ModelAndView Buy_Insert(@RequestParam("click_number") String item_number) {
		int b=buyBIZ.getInsertBuy(vo);		
		ModelAndView m=new ModelAndView("/product/application_form","b",item_number);
		
		return m;

	}*/
	
	//신청서에서 들어오는 데이터 저장
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String Buy_Insert(HttpSession session,BuyVO vo) {
		 
		int b=buyBIZ.getInsertBuy(vo);
		/*List<ProductVO> list=productBIZ.getAllProduct();
		ModelAndView m=new ModelAndView("product/select.do","list",list);*/
		System.out.println("여기는 buy 인서트 컨트롤러 ");
		return "redirect:/product/select.do";

	}

	/*// 신청서 페이지 이동
	@RequestMapping(value = "/click.do", method = RequestMethod.GET)
	public ModelAndView Buy_Insert(@RequestParam("click_number") String item_number) {
		 int b=buyBIZ.getInsertBuy(vo); 
		InternalResourceView irv = new InternalResourceView("/input/application_form.jsp");
		ModelAndView m = new ModelAndView(irv, "b", item_number);
		return m;
	}*/
/*	//신청서 확인 페이지로 이동
	@RequestMapping(value="/aplication.do",method=RequestMethod.GET)
	public ModelAndView Buy_aplication_page() {
		//InternalResourceView irv = new InternalResourceView("/input/aplication_confirm.jsp");
		List<BuyVO> list=buyBIZ.getApllication_list();
		ModelAndView m=new ModelAndView("UserOrder/aplication_confirm","list",list);
		return m;

	}*/

	public String Buy_find() {
		return null;
	}

	// 주문 상품 취소
	@RequestMapping("/deleteorder.do")
	public ModelAndView Buy_delete(@RequestParam("del_itemnum") int itemnum, HttpServletResponse response,
			HttpSession session) {

		MemberVO mvo = (MemberVO) session.getAttribute("login");
		int unumber = mvo.getUser_number();
		ModelAndView mav = new ModelAndView();

		if (buyBIZ.getDelBuy(itemnum) > 0) {
			System.out.println("삭제끝");
			List<BuyVO> all = buyBIZ.BuyAllSelectBiz(unumber);
			mav = new ModelAndView("/UserOdrer/UserOrderList", "BuyList", all);

		}
		return mav;

	}

	public String Buy_update() {
		return null;
	}

}
