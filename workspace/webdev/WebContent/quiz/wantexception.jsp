<%@page import="java.util.InputMismatchException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<style type="text/css">
@import url(css01.css);
</style>
</head>
<%
	String want=request.getParameter("want");
	String want_string = want + "가 하고 싶어요ㅜㅜ";
	
	try {
		if (!(want.equals("야구") ||
			  want.equals("축구") ||
			  want.equals("농구"))) {
			throw new InputMismatchException();
		}
	} catch(Exception e) {
		response.sendRedirect("wantform.jsp");
		return;
	}
%>
<body>

</body>
</html>