<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>
</head>
<body>

	
	<br><br>
	<h1>Available books</h1>
	
	<%@page import="java.sql.*"%>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String selectQry = "SELECT * FROM EMP ORDER BY user_id";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pwd);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQry);
			
			out.println("<table border='1'><tr><th>User Id</th><th>First Name</th><th>Last Name</th><th>DOB</th><th>Email</th><th>Action</th></tr>");
			
			while(rs.next()) {
				
				out.println("<tr><td><form action='updateProcess.jsp'><input type='text'name='id' value='" + rs.getInt(1) + "'></td><td><input type='text'name='fn' value='" + rs.getString(2) + "'></td><td><input type='text'name='ln' value='" + rs.getString(3) + "'></td><td><input type='text'name='dob' value='" + rs.getString(4) + "'></td><td><input type='text'name='email' value='"+ rs.getString(5) + "'></td><td><span><input type='hidden' value=''><input type='submit' value='edit'></form></span><span><form action='delete.jsp'><input type='hidden' name='del' value='" + rs.getString(6) + "'><input type='submit' value='Delete'></form></span></form></td></tr>");
			}
		
			out.println("</table>");
			
			con.close();
		} catch(Exception e) {out.println(e);}
	%>
	<form action="insertProcess.jsp"><table border="1"><tr><td><input type="text" name="id"></td><td><input type="text" name="fn"></td><td><input type="text" name="ln"></td><td><input type="text" name="dob"></td><td><input type="text" name="email"></td><td><input type="submit" value="add"></td></tr></table></form><br>
	<a href="index.jsp">Add List</a>
</body>
</html>