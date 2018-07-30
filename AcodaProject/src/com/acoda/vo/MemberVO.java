package com.acoda.vo;

public class MemberVO {

	
	private Member_TypeVO member_typevo;
	
	private int user_number ; //ȸ��������ȣ(P)
	private int rating; //����ڵ�(F)
	private String name; //�̸�
	private String id; //�̸�
	private String sex; //����
	private String pw; //��й�ȣ
	private String phone; //�޴�����ȣ
	private String address; //�ּ�
	private String email; //�̸���
	private String joindate; //������
	private String birth ; //�������
	private String job; //����
	private String profile; // ������(���̵��)
	private String place; //��籸��(���̵��)
	
	
	
	
	//�⺻������
	public MemberVO() {
		super();
	}
	
	
	
	//�Ű������� ��� ������ ������
	public MemberVO(int user_number, int rating, String name, String id, String sex, String pw, String phone,
			String address, String email, String joindate, String birth, String job, String profile, String place) {
		super();
		this.user_number = user_number;
		this.rating = rating;
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.pw = pw;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.joindate = joindate;
		this.birth = birth;
		this.job = job;
		this.profile = profile;
		this.place = place;
	}




	public int getUser_number() {
		return user_number;
	}
	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}
