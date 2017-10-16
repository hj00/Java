<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="process3.jsp" method="get"> -->
<form action="process3.jsp" method="post">
    이름 : <input type = "text" name="name" autofocus="autofocus"/><br/>
    나이 : <input type = "number" name="age" /><br/>
    취미 : 
          <input type="checkbox" name="game" />게임
          <input type="checkbox" name="sleep" />잠자기 
<!--     number type은 그다지 애용하지 않을 것 추천. -->
<!--     number type을 제대로 구현한 browser가 그다지 많지 않음(chrome, opera정도) -->
<input type = "submit" value="확인" />
</form>
</body>
</html>