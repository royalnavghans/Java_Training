<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>
	<%@include file="insertForm.jsp" %>
	
	<br><br>
	<h1>Available books</h1>
	
	<%@page import="java.sql.*"%>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String selectQry = "SELECT * FROM EMPLOYEE ORDER BY id";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQry);
			
			out.println("<table border='1'><tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Edit</th><th>Delete</th></tr>");
			
			while(rs.next()) {
				
				out.println(rs.getString(2));
				out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getDouble(4) + "</td><td><form action='update.jsp'><input type='hidden' name='edit' value='" + rs.getString(5) + "'><input type='submit' value='Edit'></form></td><td><form action='delete.jsp'><input type='hidden' name='del' value='" + rs.getString(6) + "'><input type='submit' value='Delete'></form></td></tr>");
			}
		
			out.println("</table>");
			con.close();
		} catch(Exception e) {out.println(e);}
	%>
</body>
</html>