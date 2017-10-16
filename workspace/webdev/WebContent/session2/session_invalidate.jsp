<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% //session제거는 한꺼번에 모두 제거하는게 일반적(따로따로제거하지 않음)
	session.invalidate();
	response.sendRedirect("sessionForm.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
</head>
<body>

</body>
</html>