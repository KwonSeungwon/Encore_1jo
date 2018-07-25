<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*,com.acoda.vo.*" %>
<%
              List<FestivalVO> all = (List<FestivalVO>)request.getAttribute("all");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>축제 게시판</h2>
<%= session.getAttribute("login") %>
<table border="1">
	<thead style="text-align:center;">
		<tr>
			<th>축제글 번호</th><th>축제이름</th><th>계절</th><th>축제 시작일</th><th>축제 마지막일</th><th>장소</th>
		</tr>
	</thead>
	<tbody style="text-align:left;">
	<c:forEach var="fe" items="${requestScope.all}">
			<tr>
				<td><c:out value=" ${fe.f_number}"/></td>
				<td><c:out value=" ${fe.f_name}"/></td>
				<td><c:out value=" ${fe.season}"/></td>
				<td><c:out value=" ${fe.f_start_date}"/></td>
				<td><c:out value=" ${fe.f_end_date }"/></td>
				<td><c:out value=" ${fe.f_local}"/></td>
			</tr>
			</c:forEach>
			</tbody>
</table>
<a href="/AcodaProject/">축제 글작성</a>
<a href="index.jsp">메인페이지로</a>

</body>
</html>