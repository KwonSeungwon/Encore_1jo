<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.acoda.vo.MemberVO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>**����������**</h2>

	<%
		MemberVO vo = (MemberVO) session.getAttribute("login");
		if (session.getAttribute("login") != null) {
	%>
	<input type="button" value="ȸ��Ż��"
		onclick="location.href ='input/UserDelete.jsp'">
	<input type="button" value="�α׾ƿ�"
		onclick="location.href ='/AcodaProject/logout.do'">
	<input type="button" value="ȸ����������"
		onclick="location.href ='input/UserChangeInfo.jsp'">
<<<<<<< HEAD
	<%=vo.getId() + "�� ȯ���մϴ�!"%>
	<%
		} else {
	%>
	<input type="button" value="�α���"
=======

		<%
		   MemberVO vo = (MemberVO) session.getAttribute("login");			
		if(session.getAttribute("login") != null){
		%>		
		<input type="button" value="�α׾ƿ�"
		onclick="location.href ='/AcodaProject/logout.do'">
	<%=vo.getId()+ "�� ȯ���մϴ�!" %>	
	<%}else{ %>
		<input type="button" value="�α���"
>>>>>>> branch 'master' of https://github.com/KwonSeungwon/Encore_1jo.git
		onclick="location.href ='input/login_form.jsp'">
<<<<<<< HEAD
	<input type="button" value="ȸ������Ʈ" onclick="location.href ='Select.do'">
	<input type="button" value="ȸ������"
		onclick="location.href ='input/UserInsert.jsp'">

	<%
		}
	%>
=======
	<%} %>
	
	<h2>�Խ��Ǳ��</h2><br>
	<a href="/AcodaProject/post_board/select.do">��ü�Խ��Ǳۺ���</a>
>>>>>>> branch 'master' of https://github.com/KwonSeungwon/Encore_1jo.git
</body>
</html>