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
</head>
<body>
<form name="mycalendar">
	<%
		//scriptlet 
	Calendar c = Calendar.getInstance();
	int year = 2017;
	int month = 6;
	int month2 = c.get(Calendar.MONTH) + 1;

		
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK); // 1일이 무슨 요일인가.
		int end_day = c.getActualMaximum(Calendar.DATE); // 마지막 날이 며칠인가?
	%>
<%-- 	<%=year + "년 " + month + "월 " %> --%>
	<table>
	<caption>
	<select name="year" onchange="document.mycalendar.submit()">
	<%
	for (int i=year-5; i <= year+5; i++) { %>
	<option <%=year == i ? " selected " : "" %>><%=i %></option>
	<% } %>    
	</select>년
<!-- 	Q1. 1월부터 12월까지 select 박스로 출력 -->
<!-- 	    현재 월을 default(selected)로 설정 -->
    <select name="month">
	<%
	for (int m=1; m <= 12; m++) { %>
	<option <%=month == m ? "selected " : "" %>><%=m %></option>
	<% } %>
	</select>월
	</caption>
	
	
	
		<tr>
			<td>일</td>
			<td>월</td>
			<td>화</td>
			<td>수</td>
			<td>목</td>
			<td>금</td>
			<td>토</td>
		</tr>
		<tr>
		<%
			for (int d = 1; d < week; d++) {
				 out.println("<td></td>");
			} // 1일 전까지 달력의 공백을 찍어주는 for 문.
			for (int d = 1, w = week; d <= end_day; d++, w++) {
				 out.println("<td>" + d + "</td>");
				if (w % 7 == 0) out.println("</tr><tr>");//주가 끝날 때 마다 한 줄 밑으로 내려가도록.
			}
		%>
		</tr>
	</table>
</form>
</body>
</html>