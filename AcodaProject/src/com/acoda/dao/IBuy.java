package com.acoda.dao;

public interface IBuy {
	//
	String select_buy="select item_number,order_number,order_day,nationality,fellow_traveler,language,unusual,application,memo"
			+ " from buy where user_number = ?";
	
	String insert_buy="insert into buy(order_number,order_day,nationality,fellow_traveler"
			+ ",language,unusual,user_number,item_number) values(buy_seq.nextval,?,?,?,?,?,?,?)";
	String find_buy="";
	
	//��û���� ���� ���� ���θ� ������Ʈ��.
	String update_buy="update buy set application=?,memo=? where order_number=?";
	
	String delete_buy="delete from buy where item_number = ?";
	//��û�� Ȯ�ν� ��Ϻ����ֱ�
	String a_select_buy="select m.id,b.order_number,b.order_day,b.nationality,b.fellow_traveler,"
			+ "b.language,b.unusual" 
			+ " from buy b,member m where b.user_number= m.user_number and b.item_number=? and application='����'";
	String click_select="select m.id,b.order_day,b.nationality,b.fellow_traveler,b.language,b.unusual"
			+ "from buy b,member m where b.user_number=m.user_number ";
}
