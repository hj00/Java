<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] names = request.getParameterValues("name");
	
	for (String name : names) {
		Cookie cookie = new Cookie(name, "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}
	response.sendRedirect("cookie_status2.jsp");
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