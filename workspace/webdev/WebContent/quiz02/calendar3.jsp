<%@page import="java.util.Calendar"%>
<!-- jsp에서 import 형태? -->
<!-- 이주석은 다 공개가 되는 주석. 중요한 내용은 이 주석에 달면안됨!!! -->
<%-- 보이지 않게 하기 위한 주석은 이것! --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function func_addmonth() {
	var f = document.mycalendar;
	f.addmonth.value = 1;
	f.submit();
}
function func_submonth() {
	var f2 = document.mycalendar;
	f2.addmonth.value = -1;
	f2.submit();
}
function func_addyear() {
	var f = document.mycalendar;
	f.addyear.value = 1;
	f.submit();
}
function func_subyear() {
	var f2 = document.mycalendar;
	f2.addyear.value = -1;
	f2.submit();
}

</script>
</head>
<body>
<form name="mycalendar">
<input type="hidden" name="addmonth" value="0"/>
<input type="hidden" name="addyear" value="0" />
	<%
		//scriptlet 
	Calendar c = Calendar.getInstance();
	int year = 0;
	int month = 0;
	int addmonth = 0;
	int addyear = 0;

	
	try {
		year = Integer.parseInt(request.getParameter("year"));
		month = Integer.parseInt(request.getParameter("month"));
		addmonth = Integer.parseInt(request.getParameter("addmonth"));
		addyear = Integer.parseInt(request.getParameter("addyear"));
		c.set(year + addyear, month - 1 + addmonth, 1);
// 		year = c.get(Calendar.YEAR);
// 		month = c.get(Calendar.MONTH) + 1;

	} catch (Exception e) {
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH) + 1;
		c.set(year + addyear, month - 1 + addmonth, 1);
	}		
  
	
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH) + 1;
		
		
		int week = c.get(Calendar.DAY_OF_WEEK); 
		int end_day = c.getActualMaximum(Calendar.DATE); 
	%>

	<table style = "width:200px;">
	<caption>
	<span onclick="func_subyear()" style="cursor:pointer">◁</span>
	<span onclick="func_submonth()" style="cursor:pointer">◀</span>
	<select name="year" onchange="document.mycalendar.submit()">
	<%
	for (int i=year-5; i <= year+5; i++) { %>
	<option <%=year == i ? " selected " : "" %>><%=i %></option>
	<% } %>    
	</select>년

    <select name="month" onchange="document.mycalendar.submit()">
	<%
	for (int m=1; m <= 12; m++) { %>
	<option <%=month == m ? "selected " : "" %>><%=m %></option>
	<% } %>
	</select>월<span onclick="func_addmonth()" style="cursor:pointer">▶</span>
	           <span onclick="func_addyear()" style="cursor:pointer">▷</span>
	</caption>	
		<tr>
			<td style="color:rgb(255,0,0)">일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td style="color:rgb(0,0,255)">토</td>
		</tr>
		<tr>
		<%
		
			for (int d = 1; d < week; d++) {
				 out.println("<td></td>");
			} // 1일 전까지 달력의 공백을 찍어주는 for 문.
			for (int d = 1, w = week; d <= end_day; d++, w++) {
				 if (w % 7 == 0) {
					 out.println("<td style = 'color:rgb(0,0,255);'>" + d + "</td>");
					 out.println("<tr></tr>");
				 } else if (w % 7 == 1) {
					 out.println("<td style = 'color:rgb(255,0,0);'>" + d + "</td>");		 					
				 } else {out.println("<td>" + d + "</td>");}
			}
		%>
		
		</tr>
	</table>
</form>
</body>
</html>