<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
       <%-- <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> --%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/sriharivishnu" user="root" password= "admin"/>
<sql:query var="rs" dataSource= "${db}"> select * from srii</sql:query> --%>
 <c:set var="DummyName" value="DummyValue2"/>             <!-- set tag it is used to create variables --> 
<c:out value="${DummyName}">No name</c:out>  
<%= "DummyName"%>
</body>
</html>