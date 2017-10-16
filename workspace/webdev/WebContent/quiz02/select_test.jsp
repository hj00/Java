<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "shortcut icon" href="../favicon.ico" />
<script type="text/javascript">
function what() {
	alert(document.myform.you.value);
}
function what_month() {
	alert(document.monthform.month.value + "월");
}

</script>
</head>
<body>
<form name="myform">
<select name="you"  multiple="multiple" onchange="what()">
	<option value="1">가위</option>
	<option value="2" selected>바위</option>
	<option value="3">보</option>
</select>
</form>
<form name="monthform">
<select name="month" onchange="what_month()">
<% int month=6;
   for(int m=1; m<=12;m++) {%>
        <option <% if(m==month) out.println( "selected" ); %>><%=m %></option>
   <% } %>
<!-- 	<option>1</option> -->
<!-- 	<option>2</option> -->
<!-- 	<option>3</option> -->
<!-- 	<option>4</option> -->
<!-- 	<option>5</option> -->
<!-- 	<option selected>6</option> -->
<!-- 	<option>7</option> -->
<!-- 	<option>8</option> -->
<!-- 	<option>9</option> -->
<!-- 	<option>10</option> -->
<!-- 	<option>11</option> -->
<!-- 	<option>12</option> -->
</select>
</form>
</body>
</html>