package com.acoda.dao;

public interface IPost_Board {
	/*int p_type; //�Խ���Ÿ�Թ�ȣ(F)
	String title; //�Խ����̸�
	int title_number; //�Խ��ǹ�ȣ
	int user_number; //ȸ��������ȣ(F)
	int post_number; //�Խñ۹�ȣ(P)
	String post_title; //�Խñ�����
	String post_contents; //�Խñ۳���
	String registration_date; //�������
	int views; //��ȸ��
	String path;//���� ���ϰ��
	String id*/
	String select_post_hugi="select post_number,title,id,post_title,registration_date,views from post_board post_board,member member where post_board.user_number=member.user_number and post_board.title_number=1 order by post_board.post_number desc";
	String insert_post_hugi="insert into post_board(p_type,title,title_number,user_number,post_number,post_title,post_contents,registration_date,views,path) values(1,'�ı�Խ���',1,?,postboard_seq.nextval,?,?,?,0,?)";
	
	String select_post_user="select post_number,title,id,post_title,registration_date,views from post_board post_board,member member where post_board.user_number=member.user_number and post_board.title_number=2 order by post_board.post_number desc";
	String insert_post_user="insert into post_board(p_type,title,title_number,user_number,post_number,post_title,post_contents,registration_date,views,path) values(2,'�����Խ���',2,?,postboard_seq.nextval,?,?,?,0,?)";
	
	String find_post="select post_number,title,id,post_title,post_contents,registration_date,views from post_board post_board,member member where post_board.user_number=member.user_number and post_board.post_number=?";
	
	String update_post_hugi="update post_board set p_type=1,title='�ı�Խ���',title_number=1,user_number=?,post_title=?,post_contents=?,registration_date=?,views=?,path=? where post_number=? ";
	String update_post_user="update post_board set p_type=2,title='�����Խ���',title_number=2,user_number=?,post_title=?,post_contents=?,registration_date=?,views=?,path=? where post_number=? ";
	
	String delete_post="delete from post_board where post_number=?";
	
	String click_post="select post_number,post_title,post_contents,registration_date,views,path,id from post_board post_board,member member where post_board.user_number=member.user_number and post_board.post_number=?";
	
	String search_post_hugi="select post_number,post_title,title,post_contents,registration_date,views,path,id from post_board post_board,member member where post_board.user_number=member.user_number and post_board.title_number=1 and post_board.post_title like '%'||?||'%' order by post_board.post_number desc";
	String search_post_user="select post_number,post_title,title,post_contents,registration_date,views,path,id from post_board post_board,member member where post_board.user_number=member.user_number and post_board.title_number=2 and post_board.post_title like '%'||?||'%' order by post_board.post_number desc";
	
	String update_viewscount="update post_board set views=views+1 where post_number=?";
	
}
