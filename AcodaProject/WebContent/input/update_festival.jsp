<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/AcodaProject/festival/update.do" method="get">
수정하세요 <br><br><br>
     
  	  	계절:<input type="text" name="season" /><br>
 		축제 이름 : <input type="text" name="f_name" /><br>
 		축제 시작날짜 : <input type="text" name="f_start_date"/><br>
 		축제 마지막 날짜 : <input type="text" name="f_end_date"/><br><br>
	 	축제 장소 : <input type="text" name="f_local" /><br>
    	축제 내용 : <input type="text" name="f_contents" /><br>
		축제글 번호 : <input type="text" name="f_number"/><br>
     
       <input type="submit" value="확인 "/>
       <input type="reset" value="취소 "/>
 </form>
</body>
</html>