<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="/AcodaProject/festival/update.do" method="post">
�����ϼ��� <br><br><br>
     
    ����:<input type="text" name="season" value="${season}"/><br>
 	���� �̸� : <input type="text" name="f_name" value="${f_name}"/><br>
 	���� ���۳�¥ : <input type="text" name="f_start_date"value="${f_start_date}" /><br>
 	���� ������ ��¥ : <input type="text" name="f_end_date"value="${f_end_date}" /><br><br>
	 ���� ��� : <input type="text" name="f_local" value="${f_local}"/><br>
    ���� ���� : <input type="text" name="f_contents" value="${f_contents}"/><br>
        ������ ��ȣ : <input type="text" name="f_number" value="${f_number}"/><br>
     
       <input type="submit" value="Ȯ�� "/>
       <input type="reset" value="��� "/>
 </form>
</body>
</html>