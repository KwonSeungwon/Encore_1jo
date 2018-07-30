package com.acoda.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acoda.vo.MemberVO;

@Repository
public class UserInfoDao {

	@Autowired
	private SqlSessionFactory sqlSessionFactory; // springmvc ���̹�Ƽ�� id�� ����(��������)

	public List<MemberVO> select() {
		List<MemberVO> list = null;
		try (SqlSession session = sqlSessionFactory.openSession()) {
			list = session.selectList("userInfo.selectalluser");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

	public String insertNomalUser(MemberVO vo) {
		String result = "";
		try (SqlSession session = sqlSessionFactory.openSession()) {
			int n = session.insert("userInfo.insertNomal", vo);
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

	public String insertUser(MemberVO vo) {
		String result = "";
		try (SqlSession session = sqlSessionFactory.openSession()) {
			int n = session.insert("userInfo.insertGuide", vo);
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
		try (SqlSession session = sqlSessionFactory.openSession()) {
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
		try (SqlSession session = sqlSessionFactory.openSession()) {
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

	public boolean IdCheck(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int count = sqlSession.selectOne("userInfo.idcount", id);
		System.out.println(count);
		if (count == 0) {
			sqlSession.commit();
			sqlSession.close();
			return true;
		} else {
			sqlSession.commit();
			sqlSession.close();
			return false;
		}
	}

}
