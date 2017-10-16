<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />">
<script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
<div class="container">
<table class="type08">
	<caption>게시물 리스트</caption>
<thead>
<tr>
	<th scope="cols">번호</th>
	<th scope="cols">제목</th>
	<th scope="cols">작성자</th>
	<th scope="cols">작성일</th>
	<th scope="cols">조회수</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="vo">
<tr>
	<td>${vo.no}</td>
	<td><a href="detail?no=${vo.no}">${vo.title}</a></td>
	<td>${vo.name}</td>
	<td><fmt:formatDate value="${vo.regdate}" type="date" /></td>
	<td>${vo.viewcount}</td>
</tr>
</c:forEach>
<tr>
	<td colspan="5">${pagination.display}
	
	</td>
	
</tr>
</tbody>
</table><br/>
<a href="insert">글쓰기</a><br/>
<div class="text-center">${pageNation.display}</div>
</div>
</body>
</html>