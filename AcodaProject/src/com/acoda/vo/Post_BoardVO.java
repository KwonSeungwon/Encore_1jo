package com.acoda.vo;

public class Post_BoardVO {

	private int p_type; // �Խ���Ÿ�Թ�ȣ(F)
	private String title; // �Խ����̸�
	private int title_number; // �Խ��ǹ�ȣ
	private int user_number; // ȸ��������ȣ(F)
	private int post_number; // �Խñ۹�ȣ(P)
	private String post_title; // �Խñ�����
	private String post_contents; // �Խñ۳���
	private String registration_date; // �������
	private int views; // ��ȸ��
	private String path;// ���� ���ϰ��
	private int total;// ����¡ó���� ���� �÷��� �� ����
	private String search_keyword;//search�� �Է¹��� �˻���

	private String id;

	public Post_BoardVO() {
		super();
	}

	// select_post_user �������� ������

	public Post_BoardVO(int total, int post_number, String title, String id, String post_title,
			String registration_date, int views) {
		super();
		this.title = title;
		this.post_number = post_number;
		this.post_title = post_title;
		this.registration_date = registration_date;
		this.views = views;
		this.id = id;
		this.total = total;
	}

	// find
	public Post_BoardVO(String title, String id, String post_title, String post_contents, String registration_date,
			int views, int post_number) {
		super();
		this.title = title;
		this.post_number = post_number;
		this.post_title = post_title;
		this.registration_date = registration_date;
		this.views = views;
		this.id = id;
		this.post_contents = post_contents;

	}

	// click
	public Post_BoardVO(int post_number, String post_title, String post_contents, String registration_date, int views,
			String path, String id) {
		super();
		this.post_number = post_number;
		this.post_title = post_title;
		this.post_contents = post_contents;
		this.registration_date = registration_date;
		this.views = views;
		this.path = path;
		this.id = id;
	}

	// search
	public Post_BoardVO(String post_title,String search_keyword,int total,int post_number,String title, String post_contents,
			String registration_date, int views, String path,String id) {
		super();
		this.post_number = post_number;
		this.post_title = post_title;
		this.title = title;
		this.post_contents = post_contents;
		this.registration_date = registration_date;
		this.views = views;
		this.path = path;
		this.total = total;
		this.id = id;
		this.search_keyword=search_keyword;
	}

	public Post_BoardVO(int p_type, String title, int title_number, int user_number, String post_title,
			String post_contents, String registration_date, int views, String path, int post_number) {
		super();
		this.p_type = p_type;
		this.title = title;
		this.title_number = title_number;
		this.user_number = user_number;
		this.post_number = post_number;
		this.post_title = post_title;
		this.post_contents = post_contents;
		this.registration_date = registration_date;
		this.views = views;
		this.path = path;
	}

	public Post_BoardVO(int p_type, String title, int title_number, int user_number, int post_number, String post_title,
			String post_contents, String registration_date, int views, String path) {
		super();
		this.p_type = p_type;
		this.title = title;
		this.title_number = title_number;
		this.user_number = user_number;
		this.post_number = post_number;
		this.post_title = post_title;
		this.post_contents = post_contents;
		this.registration_date = registration_date;
		this.views = views;
		this.path = path;
	}

	public Post_BoardVO(int p_type, String title, int title_number, int user_number, int post_number, String post_title,
			String post_contents, String registration_date, int views, String path, String id) {
		super();
		this.p_type = p_type;
		this.title = title;
		this.title_number = title_number;
		this.user_number = user_number;
		this.post_number = post_number;
		this.post_title = post_title;
		this.post_contents = post_contents;
		this.registration_date = registration_date;
		this.views = views;
		this.path = path;
		this.id = id;
	}

	public int getP_type() {
		return p_type;
	}

	public void setP_type(int p_type) {
		this.p_type = p_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTitle_number() {
		return title_number;
	}

	public void setTitle_number(int title_number) {
		this.title_number = title_number;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public int getPost_number() {
		return post_number;
	}

	public void setPost_number(int post_number) {
		this.post_number = post_number;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_contents() {
		return post_contents;
	}

	public void setPost_contents(String post_contents) {
		this.post_contents = post_contents;
	}

	public String getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

	//search������ toString
	@Override
	public String toString() {
		return "Post_BoardVO [title=" + title + ", post_number=" + post_number + ", post_title=" + post_title
				+ ", post_contents=" + post_contents + ", registration_date=" + registration_date + ", views=" + views
				+ ", path=" + path + "]";
	}
	
	

}
