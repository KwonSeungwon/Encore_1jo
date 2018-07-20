package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.acoda.vo.MemberVO;


public class UserInfoBiz {

	
	
	@Autowired
	private UserInfoDao userDao;
	
	public List<MemberVo> select() {
		return UserDao.select();
	}

	public String insert(MemberVo vo) {
		System.out.println("�μ�Ʈ�����");
		return UserDao.insertUser(vo);
	}

	public int delete(MemberVo vo) {
		System.out.println("����Ʈ�����");
		return userDao.DeleteUser(vo);
	}

	public int update(MemberVo vo) {
		System.out.println("������Ʈ");
		return userDao.UpdateUser(vo);
	}
	



	public boolean logincheck(UserInfo vo) {
		System.out.println("�α���üũ����");
		return userDao.logincheck(vo);
	}
}
}
