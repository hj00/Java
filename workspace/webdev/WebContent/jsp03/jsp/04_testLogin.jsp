<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
String id="hyun09211230";
String pwd="0101";
String name="HyunJung Byeon";
// String name2=URLEncoder.encode("성윤정", "UTF-8");
request.setCharacterEncoding("UTF-8");
if(id.equals(request.getParameter("id"))&&
   pwd.equals(request.getParameter("pwd")) ) {
   response.sendRedirect("04_main.jsp?name=" + 
	        URLEncoder.encode(name, "UTF-8")); 
}
else {
      response.sendRedirect("04_loginForm.jsp");
}
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