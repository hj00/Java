<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<!-- <script type="text/javascript" 
src="https://code.jquery.com/jquery-3.2.1.min.js"> -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <!--  <script src="http://localhost/mvc_board/resources/js/jquery-3.2.1.js"></script> -->
  <script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#speak').click(function(){
		$('#myaudio').stop();
		$('#myaudio').attr('src','../Speaker?&' + $('#myform').serialize());
		$('#myaudio').attr('autoplay','autoplay');
	});
});
</script>
</head>
<body>
<form id="myform" method="post">
<div class="container">
	<div class="jubotron">
		<h3>text2speech sample example</h3><br/>
		<p>텍스트의 내용은 선택한 보이스의 언어와 일치해야 합니다.
		혼합언어(예:영어 텍스트와 일본 여성음성)는 유효한 결과를 생성하지 않습니다.
		한글은 조만간 지원됩니다.</p>
	</div>
	<div class="row">
	<div class="col-lg-10">
	<textarea rows="7" cols="40" name="statement">
But I'm holding on for dear life, won't look down, won't open my eyes
Keep my glass full until morning light, 'cause I'm just holding on for tonight
Help me, I'm holding on for dear life, won't look down, won't open my eyes
Keep my glass full until morning light, 'cause I'm just holding on for tonight
On for tonight
	</textarea>
	</div>
	</div>
	<div class="row">
		<div class="col-lg-10">	
			<select name="voice">
				<c:forEach items="${voices}" var="voice">
					<option value="${voice.name}">${voice.language} : ${voice.description}</option>
				</c:forEach>
			</select>
		</div>
		<div class="col-lg-2">
			<input type="button" id="speak" value="읽기" />
		</div>
	</div>
<audio id="myaudio" controls="controls" preload="auto" />
</div>
</form>
</body>
</html>