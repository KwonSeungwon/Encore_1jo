<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body style="font-size:2.0em;margin: 150px 150px 150px 150px;">
	<h3>ȸ������</h3> 
	<form action="/AcodaProject/abc.do" method="POST">
	ȸ����ȣ : <input type="text" name="usernumber">
	����ڵ� : <input type="text" name="rating"><br> 
	���̵� : <input type="text" name="id"><br> 
	�н����� : <input type="password" name="pw"><br> 	
	�ڵ�����ȣ : <input 	type="text" name="phone"><br>	
	�ּ� : <input 	type="text" name="address"><br> 
	�̸��� : <input type="text" name="email"><br> 	
	������ : <input type="date" name="joindate"><br> 
	���� : <input type="text" name="job"><br> 	
	������� : <input type="date" name="birth"><br> 
	������ : <input type="text" name="profile"><br> 
	���� : <input 	type="text" name="place"><br>  
	<input type="submit" value="���">
	<input type="reset" value="���ۼ�">
	</form>

</body>
</html>