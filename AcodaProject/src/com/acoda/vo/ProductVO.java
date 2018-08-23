package com.acoda.vo;

import org.springframework.web.multipart.MultipartFile;

public class ProductVO {

	private int item_number; // ��ǰ��ȣ(P)
	private String product_name; // ��ǰ�̸�
	private int user_number; // ȸ��������ȣ(F)
	private int price; // ����
	private int head_count; // �����ο�
	private String sell_date; // �����
	private String schedule; // ������
	private String trip_date; // ����Ⱓ
	private String note;// �������
	private String id;
	private String pic;
	private int total;

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	// ��� �Ű������� ���� ������
	public ProductVO(int item_number, String product_name, int user_number, int price, int head_count, String sell_date,
			String schedule, String trip_date, String note, String id, String pic, int total) {
		super();
		this.item_number = item_number;
		this.product_name = product_name;
		this.user_number = user_number;
		this.price = price;
		this.head_count = head_count;
		this.sell_date = sell_date;
		this.schedule = schedule;
		this.trip_date = trip_date;
		this.note = note;
		this.id = id;
		this.pic = pic;
		this.total = total;

	}

	// �⺻������
	public ProductVO() {
		super();
	}

	// ��� �Ű������� ���� ������
	public ProductVO(int item_number, String product_name, int user_number, int price, int head_count, String sell_date,
			String schedule, String trip_date, String note) {
		super();
		this.item_number = item_number;
		this.product_name = product_name;
		this.user_number = user_number;
		this.price = price;
		this.head_count = head_count;
		this.sell_date = sell_date;
		this.schedule = schedule;
		this.trip_date = trip_date;
		this.note = note;
	}

	// getter setter
	public int getItem_number() {
		return item_number;
	}

	public void setItem_number(int item_number) {
		this.item_number = item_number;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHead_count() {
		return head_count;
	}

	public void setHead_count(int head_count) {
		this.head_count = head_count;
	}

	public String getSell_date() {
		return sell_date;
	}

	public void setSell_date(String sell_date) {
		this.sell_date = sell_date;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getTrip_date() {
		return trip_date;
	}

	public void setTrip_date(String trip_date) {
		this.trip_date = trip_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}