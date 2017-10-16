<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<%
RequestDispatcher dispatcher = request.getRequestDispatcher("../quiz02/calendar3.jsp");
dispatcher.forward(request,response);
%>
</head>
<body>

</body>
</html>