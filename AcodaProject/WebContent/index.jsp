<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import = "com.acoda.vo.MemberVO" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>**메인페이지**</h2>
	<input type="button" value="회원리스트"
		onclick="location.href ='input/Select.do'">
	<input type="button" value="회원가입"
		onclick="location.href ='input/insert.jsp'">
	<input type="button" value="회원탈퇴"
		onclick="location.href ='input/UserDelete.jsp'">
	<input type="button" value="회원정보수정"
		onclick="location.href ='input/UserChangeInfo.jsp'">
		<%
		   MemberVO vo = (MemberVO) session.getAttribute("login");			
		if(session.getAttribute("login") != null){
		%>		
		<input type="button" value="로그아웃"
		onclick="location.href ='/AcodaProject/logout.do'">
	<%=vo.getId()+ "님 환영합니다!" %>	
	<%}else{ %>
		<input type="button" value="로그인"
		onclick="location.href ='input/login_form.jsp'">
	<%} %>
	
	<h2>게시판기능</h2><br>
	<a href="/AcodaProject/select_post_board.do">전체게시판글보기</a>
</body>
</html>