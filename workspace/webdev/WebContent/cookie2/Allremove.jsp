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
	Cookie c1 = new Cookie("user_id","");
    Cookie c2 = new Cookie("user_name","");
    Cookie c3 = new Cookie("user_level","");
	c1.setMaxAge(0);
	c2.setMaxAge(0);
	c3.setMaxAge(0);
	response.addCookie(c1);
	response.addCookie(c2);
	response.addCookie(c3);
	
%>
<h3> 모든 쿠키가 삭제되었습니다.</h3>
<a href="cookie_status.jsp">
   쿠키 삭제를 확인하려면 클릭하세요. 
</a>  
</body>
</html>