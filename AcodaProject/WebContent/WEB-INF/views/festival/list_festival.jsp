<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.acoda.vo.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>축제 게시판</h2>
<c:set var="vo"  value="${sessionScope.login}" />
<h1><c:out value=" ${vo.rating}"/></h1>
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
				<td><a href="click.do?click_number=${fe.f_number}"><c:out value=" ${fe.f_name}"/></a></td>
				<td><c:out value=" ${fe.season}"/></td>
				<td><c:out value=" ${fe.f_start_date}"/></td>
				<td><c:out value=" ${fe.f_end_date }"/></td>
				<td><c:out value=" ${fe.f_local}"/></td>
				<c:if test="${vo.rating==3}">
				<td> <a  href ="delete.do?del_number=${fe.f_number}">삭제  </a></td>
                <td> <a  href ="find.do?find_number=${fe.f_number}">수정 </a></td>
			</c:if>
			</tr>
			
			</c:forEach>
			</tbody>
</table>

<form action="search.do" method="get">
<table border="1" cellpadding="0" cellspacing="0" width="600">
<tr>
<td align="center">
<select name="searchCondition">
<option value="title">제목 

</select>
<input name="searchkeyword" type="text" id="searchkeyword"/>
<input type="submit" value="검색"/>
</td>
</tr>
</table>
</form>
<c:if test="${vo.rating==3}">
<a href="/AcodaProject/festival/insert_page.do">축제 글작성</a>
</c:if>
<a href="/AcodaProject/index.jsp">메인페이지로</a>

</body>
</html>