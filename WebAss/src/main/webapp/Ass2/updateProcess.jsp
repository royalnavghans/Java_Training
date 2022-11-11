<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateProcess</title>
</head>
<body>
	<%@page import="java.sql.*" %>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String u_del = "DELETE FROM EMP WHERE user_id = " + id;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String updatQry = "UPDATE EMP SET user_id=" + id + ", first_name= '" + fn + "', last_name= '" + ln + "', dob= '" + dob + "', email= '" + email + "'WHERE user_id = " + id;
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pwd);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(updatQry);
			con.close();
			
			response.sendRedirect("index.jsp");
		} catch(Exception e) {out.println(e);}
	%>
</body>
</html>