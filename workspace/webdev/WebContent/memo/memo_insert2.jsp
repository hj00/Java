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
<form action="memo_insert_action2.jsp" method="post">
<table>
	<caption>메모 입력</caption>
<tr>
	<td>작성자</td>
	<td><input type="text" name="name" /></td>
</tr>
<tr>
	<td>제목</td>
	<td><input type="text" name="title" /></td>
</tr>
<tr>
	<td>내용</td>
	<td><textarea cols="40" rows="5" name="content"></textarea></td>
</tr>
</table>
<input type="submit" value="완료" />
</form>

</body>
</html>