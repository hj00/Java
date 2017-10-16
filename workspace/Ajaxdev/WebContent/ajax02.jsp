<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#binText').click(function(){
		$('#rcvMSG').load('Message.txt');
	});
	$('#binjsp').click(function() {
		$('#rcvMSG').load('msg.jsp');
	});
});
</script>
</head>
<body>
<input type="button" id="binText" value="get text" />
<input type="button" id="binjsp" value="get jsp" />
<div id="rcvMSG"></div> 

</body>
</html>