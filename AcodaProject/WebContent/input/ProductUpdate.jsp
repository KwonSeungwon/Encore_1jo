<%@page import="com.acoda.vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.acoda.vo.MemberVO"%>
<%@page import = "java.util.Date"%>
<%@page import = "java.text.SimpleDateFormat" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>
</head>
<body>
<%
ProductVO vo = (ProductVO) request.getAttribute("ulist");
String date = vo.getTrip_date();
String result[] = date.split(",");
String a = result[0];
String b = result[1];
%>

<h3>��ǰ ���� ������</h3>
<form action="/AcodaProject/product/insert.do" method="post" enctype="multipart/form-data" id = "fileupform">
		��ǰ�̸� :<input type="text" name="product_name" class = "pn" value = "${ulist.product_name}"/><br> 
		����  :<input type="text" name="price" class = "pr" value ="${ulist.price}"/><br> 
		�����ο� :<input type="text"name="head_count" class = "hcount" value = "${ulist.head_count}"/><br> 
		������  :<input type="text" name="schedule" class = "sc" value = "${ulist.schedule}"/><br>
		���� :<input type="date" name="trip_date" class = "td" value = <%=a%> /> <input type="date" name="trip_date" value =<%=b%> ><br> 
		�������  :<input type="text" name="note" class = "note" value = "${ulist.note}"/><br>
		���� : <img src = "${ulist.pic}" height="200px" ><br>
		���̵���� : <input type = "file" id = "picbu" name = "fileup"><br>
		<input type = "button" value = "���ξ��ε��ϱ�" class = "pbtn"><br>
			
		<input type = "hidden" name ="pic" class = "location"><br>
		<input type="hidden" name="itme_number" class = "pn" value = "${ulist.product_name}"/>
		
		<input type="submit" value="�����ϱ�" class = "rbtn" /> 
		<input type="reset" value="��������� " />
</form>
</body>
</html>