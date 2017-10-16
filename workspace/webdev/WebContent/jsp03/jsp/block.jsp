<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
int cnt = 0;
String bad_user_ip = "70.12.50.67";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <% 
    
    if(request.getRemoteAddr().equals(bad_user_ip)){
    	cnt++;
    	out.print(cnt);
    	if (cnt%2 == 0) {
    		out.println("당신은 불량유져이므로 접속을 차단합니다.");
    	} else if (cnt%2 != 0) {
    		out.println("당신의 아이피는 " + bad_user_ip + " 입니다.");  	
    	} 
    } else out.println("당신은 " + bad_user_ip + " 유저가 아닙니다.");
    
/*     cnt++;
    out.print(cnt);
    if (cnt%2 == 0) out.print("당신은 불량유저이므로 접속을 차단합니다.");
    else if (cnt%2 != 0) out.print("당신의 아이피는" + request.getRemoteAddr() + "입니다."); */
  %>
</body>
</html>