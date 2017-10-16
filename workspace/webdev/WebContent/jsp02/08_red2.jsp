<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<link rel = "shortcut icon" href="../favicon.ico" />
</head>
<body bgcolor="red">
red page
<jsp:forward page="08_yellow2.jsp">
	<jsp:param value="Bae Su Ji" name="username"/> 

</jsp:forward>
</body>
</html>