package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.acoda.dao.UserInfoDao;
import com.acoda.vo.MemberVO;

public class UserInfoBiz {

	@Autowired
	private UserInfoDao UserDao;

	public List<MemberVO> select() {
		return UserDao.select();
	}

	public String insert(MemberVO vo) {
		System.out.println("�μ�Ʈ�����");
		return UserDao.insertUser(vo);
	}

	public int delete(MemberVO vo) {
		System.out.println("����Ʈ�����");
		return UserDao.DeleteUser(vo);
	}

	public int update(MemberVO vo) {
		System.out.println("������Ʈ");
		return UserDao.UpdateUser(vo);
	}

	public boolean logincheck(MemberVO vo) {
		System.out.println("�α���üũ����");
		return UserDao.logincheck(vo);
	}
}
