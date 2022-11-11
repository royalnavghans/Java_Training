<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
	h1{
		text-align: center;
	}
	table {
		margin-left: auto;
		margin-right: auto;
	}
	</style>
</head>
<body>

	<h1>Update a book</h1>
	<%@page import="java.sql.*" %>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String qry="";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);

			out.println("<table border='1'><tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Save</th></tr>");
			
			while(rs.next()) {
				out.println("<tr><td><input type='text'name='id' value='" + rs.getInt(1) + "'></td><td><input type='text'name='fn' value='" + rs.getString(2) + "'></td><td><input type='text'name='ln' value='" + rs.getString(3) + "'></td><td><input type='text'name='dob' value='" + rs.getString(4) + "'></td><td><input type='text'name='email' value='"+ rs.getString(5) + "'></td><td><span><form action='updateProcess.jsp'><input type='hidden' value=''><input type='submit' value='edit'></form></span><span><form action='delete.jsp'><input type='hidden' name='del' value='" + rs.getString(6) + "'><input type='submit' value='Delete'></form></span></td></tr>");
			}
			
			out.println("</table>");
			con.close();
			
		} catch(Exception e) {out.println(e);}
	%>
</body>
</html>