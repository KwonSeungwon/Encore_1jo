<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
$(function() { $("#abutton").postcodifyPopUp(); 
	}); 
}); 
</script>
<body style="font-size:2.0em;margin: 150px 150px 150px 150px;">
	<h3>ȸ����������</h3> 
	<form action="/AcodaProject/changeuser.do" method="POST">
	ȸ������ :
	<input type = "radio" name = "rating" id = "nomal" value = "1" onclick ="this.form.place.disabled=true ; this.form.profile.disabled=true">�Ϲ�ȸ�� 
	<input type = "radio" name = "rating" id = "guide" value = "2" onclick ="this.form.place.disabled=false ; this.form.profile.disabled=false">���̵�ȸ��<br> 
	�� ��й�ȣ �Է� : <input type="password" name="id"><br>
	��ȭ��ȣ �Է� : <input type="text" name="phone"><br>
	�����ȣ<input type="text" name="address" readonly="readonly" class="postcodify_postcode5"/>
	<button type="button" id = "abutton">�˻�</button><br />
	���θ� �ּ�<input type="text" name="address" class="postcodify_address"/><br />
	���ּ� <input type="text" name="address"/><br />	���� �Է� : <input type="text" name="job"><br>
	������� �Է� : <input type="date" name="birth"><br>
	���� : <input type="text" name="job" class = "jo"><br> 	
	������ : <input type="text" name="profile" class = "pt"><br> 
	���� : <input type="text" name="place"><br>
	<input type="submit" value="�����Ϸ�">
	<input type="button" value="���" onclick="location.href ='/AcodaProject/index.jsp'">
	</form>

</body>
</html>