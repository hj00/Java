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
<form action="cookie_add.jsp" method="post">
<table>
	<caption>쿠키 생성 폼</caption>
<tr>
	<td>아이디</td>
	<td><input type="text" name="user_id" /></td>
</tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="user_name" /></td>
</tr>
<tr>
	<td>레벨</td>
	<td>
		<select name="user_level">
			<option>1</option>
			<option>2</option>
			<option>3</option>
		</select>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="완료" />
	</td>
</tr>
</table>
</form>
</body>
</html>