<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<body style="font-size: 2.0em; margin: 150px 150px 150px 150px;">
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>�����۹�ȣ</th>
			<th>�ֹ���ȣ</th>
			<th>�ֹ���¥</th>
			<th>����</th>
			<th>�ο�</th>
			<th>�����</th>
			<th>��Ÿ����</th>
			<th>��û�� ���</th>
			<th>�޼���</th>
		</tr>
		<c:forEach items="${BuyList}" var="BuyList">
			<tr>
				<td>${BuyList.item_number}</td>
				<td>${BuyList.order_number}</td>
				<td>${BuyList.order_day}</td>
				<td>${BuyList.nationality}</td>
				<td>${BuyList.fellow_traveler}</td>
				<td>${BuyList.language}</td>
				<td>${BuyList.unusual}</td>
				<td>${BuyList.application}</td>
				<td>${BuyList.memo}</td>
				<td><a  href ="deleteorder.do?del_itemnum=${BuyList.item_number}"> ����  </a></td>
			</tr>
		</c:forEach>
		</table>
		<a href="/AcodaProject/index.jsp">Ȩ ȭ������ �̵�</a>
		<div align="center"></div>

</body>
</html>