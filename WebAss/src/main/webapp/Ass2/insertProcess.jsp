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
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));
		String del = "DELETE FROM EMPLOYEE WHERE id = " + id;
		String edit = "SELECT * FROM EMPLOYEE WHERE ID = " + id;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sriharivishnu";
		String uname = "root";
		String pwd = "admin";
		String insertQry = "insert into employee values("+id +", '" + title + "', '" + author + "', " + price + ", '" + edit + "', '" + del +"')";
		
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