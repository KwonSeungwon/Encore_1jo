package com.acoda.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.acoda.vo.MemberVO;

public class UserInfoDao {

/*	@Autowired
	private SqlSessionFactory factory; // springmvc ���̹�Ƽ�� id�� ����(��������)
	private SqlSession sqlsession;

	public List<MemberVO> select() {
		List<MemberVO> list = null;
		try (SqlSession session = factory.openSession()) {
			list = session.selectList("userInfo.selectalluser");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public String insertUser(MemberVO vo) {
		String result = "";
		try (SqlSession session = factory.openSession()) {
			int n = session.insert("userInfo.insertUser", vo);
			System.out.println("�ٿ�����");
			if (n > 0) {
				result = vo.getId();
				System.out.println("������ ������ �Ϸ��.");
				session.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public int DeleteUser(MemberVO vo) {
		try (SqlSession session = factory.openSession()) {
			int n = session.delete("userInfo.deleteUser", vo);
			System.out.println("�����ٿ�����");
			if (n > 0) {
				System.out.println("������ ���� �Ϸ�.");
				session.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public int UpdateUser(MemberVO vo) {
		try (SqlSession session = factory.openSession()) {
			int n = session.update("userInfo.updateUser", vo);
			System.out.println("�����ٿ�����");
			if (n > 0) {
				System.out.println("������ ���� �Ϸ�.");
				session.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public boolean logincheck(MemberVO vo) {
		System.out.println("�α��� üũ �ٿ�");
		int count = Integer.parseInt(sqlsession.selectOne("userInfo.check", vo).toString()),
				totalCount = sqlsession.selectOne("userInfo.totalcount");

		if (totalCount > 0) {
			if (count > 0) {
				return true;
			} else {
				return false;
			}
		}

		return false;

	}*/

}
