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
	String select_post="select post_number,title,id,post_title,registration_date,views from post_board post_board,member member where post_board.user_number=member.user_number";
	String insert_post="insert into post_board(p_type,title,title_number) values(?,?,?,?,postboard_seq.nextval,?,?,?,?,?)";
	String find_post="select post_number,title,id,post_title,registration_date,views from post_board post_board,member member where post_board.user_number=member.user_number and post_board.post_number=?";
	String update_post="update post_board set p_type=?,title=?,title_number=?,user_number=?,post_title=?,post_contents=?,registration_date=?,views=?,id=? where post_number=? ";
}
