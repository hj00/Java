<%@page import="java.net.URLDecoder"%>
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
<a href="cookieForm.jsp">쿠키생성</a> <br/>
<hr/>
<a href="cookieRemove.jsp?name=user_id">ID 삭제</a> <br/>
<hr/>
<a href="cookieRemove.jsp?name=user_name">이름 삭제</a> <br/>
<hr/>
<a href="cookieRemove.jsp?name=user_level">레벨 삭제</a> <br/>
<hr/>
<a href="cookieRemove.jsp?name=user_id&name=user_name&name=user_level">전체 삭제</a> <br/>
<hr/>
<%
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie c : cookies) {
			if (!c.getName().equals("JSESSIONID")) {
				out.println("쿠키이름 : " + c.getName() + "<br/>");
				out.println("쿠키 값 : " + URLDecoder.decode(c.getValue(), "UTF-8") + "<br/>");
				out.println("<hr/>");
			}
		}
	}
%> 
</body>
</html>