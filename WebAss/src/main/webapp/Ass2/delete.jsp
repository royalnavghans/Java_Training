<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.sql.*" %>
	<%
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/sriharivishnu";
	String uname = "root";
	String pwd = "admin";
	String del = request.getParameter("del");
	
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement stmt = con.createStatement();
		int ab=stmt.executeUpdate(del);
		
		
		con.close();
		response.sendRedirect("index.jsp");
	} catch(Exception e) {
		out.println(e);
	}
	
	%>	
</body>
</html>