<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp calculator</title>
</head>
<body>

  <%
  
  int a=Integer.parseInt(request.getParameter("num1"));
  int b=Integer.parseInt(request.getParameter("num2"));
  int c=Integer.parseInt(request.getParameter("num3"));
  int d=Integer.parseInt(request.getParameter("num4"));
  int add=a+b;
  int mul=c*d;
  

  %>
  <%="Adding two value : "+add %><br>
    <%="Multiplying two value : "+mul %>
  

  
 
</body>
</html>