<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
</head>
<body>
<%
	Cookie cookies = new Cookie("user_level","");
	cookies.setMaxAge(0);
	response.addCookie(cookies);
%>
<h3> 레벨 쿠키가 삭제되었습니다.</h3>
<a href="cookie_status.jsp">
   쿠키 삭제를 확인하려면 클릭하세요. 
</a>  
</body>
</html>