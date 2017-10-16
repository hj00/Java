<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remove cookie ID</title>
<link rel = "shortcut icon" href="../favicon.ico" />
</head>
<body>
<%
	Cookie cookies = new Cookie("user_id","");
	cookies.setMaxAge(0); // 쿠키의 유효시간 만료시킴
	response.addCookie(cookies);
%>
<h3> id 쿠키가 삭제되었습니다.</h3>
<a href="cookie_status.jsp">
   쿠키 삭제를 확인하려면 클릭하세요. 
</a>  
</body>
</html>