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
	<%if(vo.getRating() == 1){ %>
	<input type="button" value="ȸ����������"
		onclick="location.href ='input/UserNomalUpdate.jsp'">
		<%}else if(vo.getRating() == 2){ %>
	<input type="button" value="ȸ����������"
		onclick="location.href ='input/UserGuideUpdate.jsp'">
		<%}%>
	<%=vo.getUser_number() + "�� ȯ���մϴ�!"%>
	<%
		} else if(session.getAttribute("login") == null) {
		%>
	<input type="button" value="�α���"
		onclick="location.href ='input/login_form.jsp'">
	<input type="button" value="ȸ������Ʈ" onclick="location.href ='Select.do'">
	<input type="button" value="ȸ������"
		onclick="location.href ='input/UserInsert.jsp'">

	<%
		}
	%>

	<h2>�Խ��Ǳ��</h2>
	<br>
<<<<<<< HEAD

	<a href="/AcodaProject/post_board/select.do">��ü�Խ��Ǳۺ���</a>
    <a href="/AcodaProject/festival/select.do">���� �Խ��� ����</a>
	<a href="/AcodaProject/post_board/select.do">�Խ���</a>

=======
	<a href="/AcodaProject/post_board/select_user.do">�����Խ���</a><br>
	<a href="/AcodaProject/post_board/select_hugi.do">�ı�Խ���</a>
>>>>>>> branch 'master' of https://github.com/KwonSeungwon/Encore_1jo.git
</body>
</html>