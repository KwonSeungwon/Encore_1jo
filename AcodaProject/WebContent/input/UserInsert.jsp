<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*, java.text.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>

<body style="font-size:2.0em;margin: 150px 150px 150px 150px;">
	<h3>ȸ������</h3> 
	<form action="/AcodaProject/abc.do" method="POST">
	�������� : 
	<input type = "radio" name = "rating" value = "1" onclick ="this.form.place.disabled=true ; this.form.profile.disabled=true">�Ϲ�ȸ�� 
	<input type = "radio" name = "rating" value = "2" onclick ="this.form.place.disabled=false ; this.form.profile.disabled=false">���̵�ȸ��<br> 
	�̸� : <input type="text" name="name"><br>
	���� : <input type="text" name="sex"><br>
	���̵� : <input type="text" name="id" class = "idtest"/> <input type = "button" id = "idcheck" value ="���̵� �ߺ�üũ"/>
	<script type="text/javascript">
	$(document).ready(function () {	
		  $("#idcheck").click(function(){
			var value = $(".idtest").val();
			if(value == ""){
				alert('���̵� �Է��ϼ���');
				history.back();
			}else{
				alert(value);
				location.href ='../idcheck.do?id =' + value;
			}
		});
	});
	</script>
	�н����� : <input type="password" name="pw"><br> 	
	�ڵ�����ȣ : <input type="text" name="phone"><br>	
	�ּ� : <input 	type="text" name="address"><br> 
	�̸��� : <input type="text" name="email" class = "testemail"> <input type = "button" id = "emailcheck" value ="�̸��� �ߺ�üũ" onclick="location.href ='emailcheck.do'"><br>
	<script type="text/javascript">	
	$(document).ready(function () {	
		  $("#emailcheck").click(function(){
			var emailV = $('.testemail').val();
			if(emailV == ""){
				alert('�̸����� �Է��ϼ���');
				history.back();
			}else{
			alert(emailV);

			}
		});
	});
	</script> 	
	���� : <input type="text" name="job"><br> 	
	������� : <input type="date" name="birth"><br> 
	������ : <input type="text" name="profile"><br> 
	���� : <input 	type="text" name="place"><br>  
	<input type="submit" value="���">
	<input type="reset" value="���ۼ�">
	</form>

</body>
</html>