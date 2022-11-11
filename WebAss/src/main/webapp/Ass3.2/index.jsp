<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<!--
		Using HTML,SQL,Servlet,JSP,JSTL
		Create an emp table in the database with fields
		name, id and designation.Create a HTML file with fields name, id and
		designation. Make sure that the textfields have the same
		name as name, id and designation.On click of the submit button of the HTML, invoke a
		jsp page which will extract the values that were given by
		the HTML page and it invokes a servlet.The Servlet will make a connection to the database and store the value in the table.Connection to the database should have been
		established using JSTL and You can enhance the program by including more features
		like deletion, updation and selecting all records.
	 -->
	 <h2>Insert Employee:</h2>
	 <form action='getData.jsp'>
	 	<input type='hidden' name='select' value='index'>
	 	<table>
	 		<tr><td><label>Emp id: </label></td><td><input type='text' name='id' placeholder="Enter Emp id"></td></tr>
	 		<tr><td><label>Emp Name: </label></td><td><input type='text' name='name' placeholder="Enter Emp name"></td></tr>
	 		<tr><td><label>Emp Designation: </label></td><td><input type='text' name='desg' placeholder="Enter Emp Designation"></td></tr>
	 		<tr><td colspan="2" align="center"><input type="submit"></td>
	 	</table>
	 </form>
	 
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/royalnavghan" user="root" password="admin"/>
	<sql:query var="rs" dataSource="${db}">SELECT * FROM emp</sql:query>
	
	<h2>Update Employee:</h2>
	<form action="getData.jsp">
		<input type='text' name='id' placeholder="Enter Emp id">
		<input type='text' name='name' placeholder="Enter Emp name">
		<input type='text' name='desg' placeholder="Enter Emp Designation">
		<input type='hidden' name='update' value='up'>
		<input type='submit' value='Save'>
	</form>
	
	<br><h2>List of Employees:</h2>
	<table border="1">
	<tr><th>ID</th><th>Name</th><th>Designation</th><th>Delete</th></tr>
	<c:forEach var="emp" items="${rs.rows}">
		<tr><td><c:out value="${emp.id}"></c:out></td><td><c:out value="${emp.name1}"></c:out></td><td><c:out value="${emp.designation}"></c:out></td>
			<td>
				 <form action='getData.jsp'> 
					<input type='hidden' name='deletepage' value='del'>
					<input type="hidden" value='${emp.id}' name='delete'>
					<input type="submit" value='Delete'> 
					
				 </form> 
			</td>
		</tr>
	</c:forEach>
	 </table>
</body>
</html>