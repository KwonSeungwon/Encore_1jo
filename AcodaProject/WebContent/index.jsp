<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>**����������**</h2>
	<input type="button" value="ȸ������Ʈ"
		onclick="location.href ='/TeamProject/Select.do'">
	<input type="button" value="ȸ������"
		onclick="location.href ='/TeamProject/insert.jsp'">
	<input type="button" value="ȸ��Ż��"
		onclick="location.href ='/TeamProject/outuser.jsp'">
	<input type="button" value="ȸ����������"
		onclick="location.href ='/TeamProject/changeinfo.jsp'">
	<c:if test="${userInfo == null}">
		<input type="button" value="�α���"
			onclick="location.href ='/TeamProject/login_form.jsp'">
	</c:if>
	<c:if test="${userInfo!= null}">
		<input type="button" value="�α׾ƿ�" onclick="">
	</c:if>
	<%=session.getAttribute("userInfo") %>
	
</body>
</html>