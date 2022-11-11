<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert data</title>
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
	<h1>Add a Book</h1>
	<form action="insertprocess.jsp">
    <table border="1">
        <tr>
            <th>User Id</th><th>First Name</th><th>Last Name</th><th>DOB</th><th>Email</th><input type="submit" value="add"></th>
        </tr>
        <tr><td><input type="text"></td><td><input type="text"></td><td><input type="text"></td><td><input type="text"></td><td><input type="text"></td></tr>
    </table>
</form>

</body>
</html>