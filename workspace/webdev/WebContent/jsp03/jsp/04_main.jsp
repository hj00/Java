<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style type="text/css">
sa {
   font-size: 20pt;
   color: orange;
}
sa2 {
     font-size: 18pt;
}
</style>
<link rel = "shortcut icon" href="../favicon.ico" />
</head>
<body>
<sa>
<h2><%= request.getParameter("name") %>님 안녕하세요!</h2><br/>
</sa>
<sa2>
저희 홈페이지에 방문해 주셔서 감사합니다.<br/>
즐거운 시간 되세요....<br/>
</sa2>
</body>
</html>