<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String age=request.getParameter("age");
String name=(String)request.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<style type="text/css">
b {
   font-size: 20pt;
   color: white;
}
</style>
</head>
<body bgcolor=#123456>
<b>forward 방식으로 이동된 페이지<br/>
  나이 : <%=age %>
  이름 : <%=name %></b>
</body>
</html>