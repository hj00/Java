<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 

   String name = request.getParameter("name");
   int age = Integer.parseInt(request.getParameter("age"));
   
   String popo = request.getParameter("popo");
   
   int age2 = age/10;
   if (age2 < 2) popo="묘령";
   else if (age2 == 2) popo="약관";
   else if (age2 == 3) popo="이립";
   else if (age2 == 4) popo="불혹";
   else if (age2 == 5) popo="지천명";
   else if (age2 == 6) popo="이순";
   else if (age2 > 7) popo="종심";
   
//    if (age<20) popo="묘령";
//    else if (20<=age&&age<=29) popo="약관";
//    else if (30<=age&&age<=39) popo="이립";
//    else if (40<=age&&age<=49) popo="불혹";
//    else if (50<=age&&age<=59) popo="지천명";
//    else if (60<=age&&age<=69) popo="이순";
//    else if (age>70) popo="종심";
   
//    age = age/10;
//    if (age < 2) popo="묘령";
//    else if (age == 2) popo="약관";
//    else if (age == 3) popo="이립";
//    else if (age == 4) popo="불혹";
//    else if (age == 5) popo="지천명";
//    else if (age == 6) popo="이순";
//    else if (age > 7) popo="종심";
//    age = Integer.parseInt(request.getParameter("age"));
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
그래, 난 <%=name %>, 포기를 모르는 남자지.<br/>
나이 : <%=age %> (<%=popo %>)
</body>
</html>