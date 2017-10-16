<%@page import="java.io.IOException" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
  public void commentAge(JspWriter out, int age) throws IOException {
//out개체를 따로 받는 건 그다지 좋은 방법 아님. ->process3 코드 참조.
	switch(age/10) {
    case 0: 
    case 1:
        out.println("묘령");break;
    case 2:
        out.println("약관");break;
    case 3:
        out.println("이립");break;
    case 4:
        out.println("불혹");break;
    case 5:
        out.println("지천명");break;
    case 6:
        out.println("이수");break;
    default:
        out.println("종심");break;
    }
}
%>

<% 

   String name = request.getParameter("name");
   int age = Integer.parseInt(request.getParameter("age"));
      
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>그래, 난 <%=name %>, 포기를 모르는 남자지.</h1>
나이 : <%=age %> (<% commentAge(out, age); %>)<br/>
</body>
</html>