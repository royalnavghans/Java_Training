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
	int id = Integer.parseInt(request.getParameter("id"));
	String fn = request.getParameter("fn");
	String ln = request.getParameter("ln");
	String dob = request.getParameter("dob");
	String email = request.getParameter("email");
	String del = "DELETE FROM EMP WHERE user_id = " + id;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String insertQry = "insert into emp values("+id +", '" + fn + "', '" + ln + "', '" + dob + "', '" + email + "', '" + del +"')";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, uname, pwd);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(insertQry);
			con.close();
			
			response.sendRedirect("index.jsp");
		} catch(Exception e) {out.println(e);}
	%>
</body>
</html>