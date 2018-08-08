package com.acoda.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.acoda.biz.BuyBIZ;
import com.acoda.biz.ProductBIZ;
import com.acoda.vo.BuyVO;
import com.acoda.vo.MemberVO;

@Controller
@RequestMapping("/buy")
public class BuyServlet {

	@Autowired
	BuyBIZ buyBIZ;
	@Autowired
	ProductBIZ productBIZ;

	// �ֹ� ��ǰ ��ȸ
	@RequestMapping("/UserOrderList.do")
	public ModelAndView Buy_Select(HttpSession session, HttpServletResponse response) throws IOException { // ��Ʈ�ѷ� �Ű�������

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

/*	//��û������ ������ ������ ����
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String Buy_Insert(HttpSession session,BuyVO vo) {
		 
		int b=buyBIZ.getInsertBuy(vo);
		List<ProductVO> list=productBIZ.getAllProduct();
		ModelAndView m=new ModelAndView("product/select.do","list",list);
		System.out.println("����� buy �μ�Ʈ ��Ʈ�ѷ� ");
		return "redirect:/product/select.do";

	}*/
	
	//��û������ ������ ������ ����
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)
	public String Buy_Insert(HttpSession session,BuyVO vo) {
		 
		int b=buyBIZ.getInsertBuy(vo);
		/*List<ProductVO> list=productBIZ.getAllProduct();
		ModelAndView m=new ModelAndView("product/select.do","list",list);*/
		System.out.println("����� buy �μ�Ʈ ��Ʈ�ѷ� ");
		return "redirect:/product/select.do";

	}

	/*// ��û�� ������ �̵�
	@RequestMapping(value = "/click.do", method = RequestMethod.GET)
	public ModelAndView Buy_Insert(@RequestParam("click_number") String item_number) {
		 int b=buyBIZ.getInsertBuy(vo); 
		InternalResourceView irv = new InternalResourceView("/input/application_form.jsp");
		ModelAndView m = new ModelAndView(irv, "b", item_number);
		return m;
	}*/
/*	//��û�� Ȯ�� �������� �̵�
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

	// ������ ��û���� ��������.
	@RequestMapping(value="delorder.do", method=RequestMethod.GET)
	public ModelAndView Buy_delete(@RequestParam("del_ordernum") int order_number,HttpSession session) {

		MemberVO mvo = (MemberVO) session.getAttribute("login");
		int unumber = mvo.getUser_number();
		
		ModelAndView mav = new ModelAndView();
		
		System.out.println(order_number);
		int b=buyBIZ.getDelBuy(order_number);
		System.out.println(b);
		
		if (buyBIZ.getDelBuy(order_number) > 0) {
			System.out.println("������");
	
		}
		List<BuyVO> all = buyBIZ.BuyAllSelectBiz(unumber);
		mav = new ModelAndView("/UserOrder/UserOrderList", "BuyList", all);
		return mav;
	}

	public String Buy_update() {
		return null;
	}
	//��û���� ������ ���� �Ǵ� ������ ����
	@RequestMapping(value = "/application_update.do" ,method=RequestMethod.POST)
	public String update_application(@RequestParam String[] memo,@RequestParam String[] application, @RequestParam int[] order_number) {
		BuyVO vo = new BuyVO();
		for(int i = 0 ; i < memo.length; i++) {
			vo.setMemo(memo[i]);
			vo.setApplication(application[i]);
			vo.setOrder_number(order_number[i]);
			buyBIZ.geta_UpdateBuy(vo);
		}
//	System.out.println(vo.getOrder_number()+"��Ʈ�ѷ�");
//	System.out.println(vo.getApplication());
//	System.out.println(vo.getMemo());
	
	//String[] order = request.getParameterValues("order_number");
	
		//int b=buyBIZ.geta_UpdateBuy(vo);
		
		
		return "redirect:/product/select.do";		
	}
}
