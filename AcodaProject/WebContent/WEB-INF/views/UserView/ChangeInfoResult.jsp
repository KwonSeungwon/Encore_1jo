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
<body style="font-size : 2em;margin :150px 150px 150px 150px" >
<c:if test="${!empty myid}">
<h3>회원정보 수정 완료</h3>
<a href = "/TeamProject/outuser.jsp">홈 화면으로 이동</a>

</c:if>


<c:if test="${empty myid}">
<h3>회원정보 수정 실패</h3>
<a href = "/TeamProject/index.html">다시시도하기</a>
</c:if>




</body>
</html>