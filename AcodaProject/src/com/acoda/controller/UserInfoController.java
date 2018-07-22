package com.acoda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.acoda.biz.UserInfoBiz;
import com.acoda.vo.MemberVO;

@Controller
public class UserInfoController {

	// ���� ������̵�
	@Autowired
	private UserInfoBiz infoBiz;

	// �μ�Ʈ ��Ʈ�ѷ�
	@RequestMapping(value = "/abc.do", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("userInfo") MemberVO vo) {
		System.out.println("��Ʈ�ѷ� ����" + vo.getUsernumber());
		String result = infoBiz.insert(vo);
		ModelAndView mav = new ModelAndView("UserView/InsertResult", "myresult", result);
		// ������� : result.jsp, ������ ��ü��(request��ü) : myresult, ������ ��ü : result
		return mav;
	}

	// ��������Ʈ ��Ʈ�ѷ�
	@RequestMapping("/Select.do")
	public ModelAndView select() {
		List<MemberVO> list = infoBiz.select();
		ModelAndView mav = new ModelAndView("UserView/UserAllList", "list", list);

		return mav;
	}

	// ����Ʈ ��Ʈ�ѷ�
	@RequestMapping(value = "deleteuser.do", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute("userInfo") MemberVO vo) {
		System.out.println("���� ���̵� :" + vo.getId() + vo.getPw());
		ModelAndView mav = new ModelAndView("UserView/DeleteUserResult", "myid", vo);
		infoBiz.delete(vo);
		return mav;
	}

}
