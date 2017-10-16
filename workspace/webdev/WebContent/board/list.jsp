<%@page import="board.model.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	long pg = 1; // 현재 페이지(출력중인) 나타내기 위해 만듦
	
	try {
		pg = Long.parseLong(request.getParameter("pg"));
	} catch(Exception e) {}
	
	int pageSize = 10; //한 페이지에 출력할 게시물 수 
	long startnum = (pg - 1)*pageSize + 1; // 출력페이지 시작 번호
	long endnum = pg * pageSize; // 출력페이지 끝번호
	long totalCount = 0; //전체 게시물 수
	//전체 페이지 수(pageCount) = 전체 게시물 수 / pageSize
	long pageCount = 0;
	long blockSize = 10; // 한 페이지에 출력할 페이지 수 
	long startPage = (pg-1)/blockSize*blockSize + 1; // 페이지 블럭 시작
	long endPage = (pg-1)/blockSize*blockSize + blockSize; // 페이지 블럭 끝
	
	
	
	BoardDAO boardDAO = BoardDAO.getinstance();
	totalCount = boardDAO.getTotalCount(); // 전체 게시물 갯수 조회
	List<BoardVO> list = boardDAO.getBoardList(startnum, endnum); // 
	
	pageCount = totalCount/pageSize;
	if (totalCount % pageSize != 0) {
		pageCount++;
	}
	if (pageCount < endPage) endPage = pageCount;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />
<style type="text/css">
table.type08 {
    border-collapse: collapse;
    text-align: left;
    line-height: 1.5;
    border-left: 1px solid #ccc;
    margin: 20px 10px;
}

table.type08 thead th {
    padding: 10px;
    font-weight: bold;
    border-top: 1px solid #ccc;
    border-right: 1px solid #ccc;
    border-bottom: 2px solid #c00;
    background: #dcdcd1;
}
table.type08 tbody th {
    width: 150px;
    padding: 10px;
    font-weight: bold;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
    background: #ececec;
}
table.type08 td {
    width: 350px;
    padding: 10px;
    vertical-align: top;
    border-right: 1px solid #ccc;
    border-bottom: 1px solid #ccc;
}

</style>
</head>
<body>
<table class="type08">
	<caption>게시물 리스트</caption>
<thead>
<tr>
	<th scope="cols">번호</th>
	<th scope="cols">작성자</th>
	<th scope="cols">제목</th>
	<th scope="cols">작성일</th>
	<th scope="cols">조회수</th>
</tr>
</thead>
<tbody>
<%
	for (BoardVO boardVO : list) { %>
<tr>
	<td><%=boardVO.getNo() %></td>
	<td><%=boardVO.getName() %></td>
	<td><a href="content.jsp?no=<%=boardVO.getNo() %>"><%=boardVO.getTitle() %></a></td>
	<td><%=boardVO.getLagdate() %></td>
	<td><%=boardVO.getView_count() %></td>
</tr>
<% } %>
</tbody>
<tr>
	<td colspan="5" align="center">
		<% if (startPage == 1) { %>
		   [이전블럭]
		<% } else { %>
		   <a href="list.jsp?pg=<%=startPage -1 %>">[이전블럭]</a>
		<% } %>
			
		<%
		for (long p=startPage; p <= endPage; p++) { %>
			<%if (p==pg) { %>
				<%=p %>
			<%} else { %>
				<a href="list.jsp?pg=<%=p%>"><%=p%></a>
			<%} %>
		<%}%>
		
		<%if (endPage == pageCount) { %>
			[다음블럭]
		<% } else { %>
		   <a href="list.jsp?pg=<%=endPage + 1 %>">[다음블럭]</a>
		<% } %>
	</td>
</table><br/>
<a href="insert.jsp">글쓰기</a><br/>
</body>
</html>