package com.acoda.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acoda.dao.Post_BoardDAO;
import com.acoda.vo.Post_BoardVO;


@Service
public class Post_BoardBIZ {
	
	
	@Autowired
	Post_BoardDAO post_boardDAO;
	//Select(��ü������)
	public List<Post_BoardVO> getHugiPost_Board(){
		return post_boardDAO.getHugiPost_Board();
	}
	public List<Post_BoardVO> getUserPost_Board(){
		return post_boardDAO.getUserPost_Board();
	}
	//Insert
	public int getInsert_User_Post_Board(Post_BoardVO vo) {
		System.out.println("Post_BoardBIZ�� getInsert_User_Post_Board ����");
		Post_BoardVO pvo = new Post_BoardVO();
		pvo.setUser_number(vo.getUser_number());
		pvo.setPost_number(vo.getPost_number());
		pvo.setPost_title(vo.getPost_title());
		pvo.setPost_contents(vo.getPost_contents());
		pvo.setRegistration_date(vo.getRegistration_date());
		pvo.setViews(vo.getViews());
		pvo.setPath(vo.getPath());
		return post_boardDAO.getInsert_UserPost_Board(pvo);
	}
	public int getInsert_Hugi_Post_Board(Post_BoardVO vo) {
		System.out.println("Post_BoardBIZ�� getInsert_Hugi_Post_Board ����");
		Post_BoardVO pvo = new Post_BoardVO();
		pvo.setUser_number(vo.getUser_number());
		pvo.setPost_number(vo.getPost_number());
		pvo.setPost_title(vo.getPost_title());
		pvo.setPost_contents(vo.getPost_contents());
		pvo.setRegistration_date(vo.getRegistration_date());
		pvo.setViews(vo.getViews());
		pvo.setPath(vo.getPath());
		return post_boardDAO.getInsert_HugiPost_Board(pvo);
		}
	//Find
	public Post_BoardVO getFindPost_Board(String find_post_number) {
		return post_boardDAO.getFindPost_Board(find_post_number);
	}
	//Update
	public int getUpdate_User_Post_Board(Post_BoardVO vo) {
		Post_BoardVO pvo = new Post_BoardVO();
		pvo.setUser_number(vo.getUser_number());
		pvo.setPost_number(vo.getPost_number());
		pvo.setPost_title(vo.getPost_title());
		pvo.setPost_contents(vo.getPost_contents());
		pvo.setRegistration_date(vo.getRegistration_date());
		pvo.setViews(vo.getViews());
		pvo.setPath(vo.getPath());
		return post_boardDAO.getUpdateUser_Post_Board(pvo);
	}
	public int getUpdate_Hugi_Post_Board(Post_BoardVO vo) {
		Post_BoardVO pvo = new Post_BoardVO();
		pvo.setUser_number(vo.getUser_number());
		pvo.setPost_number(vo.getPost_number());
		pvo.setPost_title(vo.getPost_title());
		pvo.setPost_contents(vo.getPost_contents());
		pvo.setRegistration_date(vo.getRegistration_date());
		pvo.setViews(vo.getViews());
		pvo.setPath(vo.getPath());
		return post_boardDAO.getUpdateHugi_Post_Board(pvo);
	}
	
	//Delete
	public int getDelPost_Board(String del_post_number) {
		
		return post_boardDAO.getDelPost_Board(del_post_number);
		
	}
	
	//Click(������ �󼼺���)
	public List<Post_BoardVO> getClickPost_Board(String click_post_number) {
		return post_boardDAO.getClickPost_Board(click_post_number);
	
	}
	
	//Search(�������ΰ˻�)
	public List<Post_BoardVO> getSearch_Post_Board_User(String s){
		System.out.println("Post_BoardBIZ->getSearch_Post_Board_Userȣ��->String s = "+s);
		return  post_boardDAO.getSearch_Post_Board_User(s);
	}
	public List<Post_BoardVO> getSearch_Post_Board_Hugi(String s){
		return  post_boardDAO.getSearch_Post_Board_Hugi(s);
	}
	
	
	
}
