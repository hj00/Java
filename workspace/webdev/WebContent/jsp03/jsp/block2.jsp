<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 광섭오빠 코드 -->

<%! int declatation =0; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

if(request.getRemoteAddr().equals("70.12.50.68") == true){
   declatation++;
   out.println(declatation);
   if(declatation%2==0){
     out.println("당신은 불량 유저이므로 접속을 차단합니다");
   } else if(declatation%2==1){
            out.println("당신은 아이피는 " + request.getRemoteAddr() + " 입니다."); 
   } 
} else out.println("you are not 70.12.50.68");

%>
</body>
</html>