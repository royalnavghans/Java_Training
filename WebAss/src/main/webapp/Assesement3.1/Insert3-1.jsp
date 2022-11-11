<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name=request.getParameter("name");
String pass=request.getParameter("pass");
String email=request.getParameter("email");

if(name ==""){
	out.println("Field shall not be empty");
}
if(pass==""){
	out.println("Field shall not be empty");
}
if(email==""){
	out.println("Field shall not be empty");
}





%>
</body>
</html>