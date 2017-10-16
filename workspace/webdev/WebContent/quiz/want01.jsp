<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
   String name = request.getParameter("want");
   String want = name + "가<br/> 하고<br/> 싶어요";
%>
<!DOCTYPE html>
<html>
<head>
<meta http=equiv="Content-Type" content="text/html; charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<style type="text/css">
@import url(css01.css);
</style>
</head>
<body>
<div id="want"><img src="want.png" width="60%" /></div>
<%-- <div class="say"><h3>안선생님,<br/> <%=name %>가<br/> 하고<br/> 싶어요.<br/></h3></div> --%>
<div class="say"><h3><%=want %></h3></div>
</body>
</html>