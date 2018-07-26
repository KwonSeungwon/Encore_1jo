package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.UserInfoDao;
import com.acoda.dao.UserLoginDao;
import com.acoda.vo.MemberVO;

@Service
public class UserInfoBiz {

	@Autowired
	private UserInfoDao UserDao;
	@Autowired
	private UserLoginDao LoginDao;
	

	public List<MemberVO> select() {
		return UserDao.select();
	}

	public String insert(MemberVO vo) {
		System.out.println("�μ�Ʈ�����");
		UserDao.insertUser(vo);
		String guide = "";
		return guide;
	}

	public int delete(MemberVO vo) {
		System.out.println("����Ʈ�����");
		return UserDao.DeleteUser(vo);
	}

	public int update(MemberVO vo) {
		System.out.println("������Ʈ");
		return UserDao.UpdateUser(vo);
	}

	public int logincheck(MemberVO vo) {
		System.out.println("�α���üũ����");
		return LoginDao.LoginCheck(vo);
	}

	public String insertNomal(MemberVO vo) {
		System.out.println("�μ�Ʈ�븻�����");
		UserDao.insertNomalUser(vo);	
		String nomal = "";
		return nomal;
	}
	
	public boolean checkId(String id) {
		if(UserDao.IdCheck(id) == true) {
			return true;
		}else { 
			return false;
		}
	}

}
