<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
</head>
<body>
	<%@page import="java.sql.*" %>
	
	<c:set var="id" value="${param.id}"/>
	<c:set var="name" value="${param.name}"/>
	<c:set var="desg" value="${param.desg}"/>
	<c:out value='${desg}'></c:out>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/royalnavghan" user="root" password="admin"/>
	
	<c:choose>
		<c:when test="${param.select=='index'}">
			<sql:update var="rs" dataSource="${db}">INSERT INTO emp VALUES(?, ?, ?)
				<sql:param value="${id}"></sql:param>
				<sql:param value="${name}"></sql:param>
				<sql:param value="${desg}"></sql:param>
			</sql:update>
			<c:redirect url="index.jsp"></c:redirect>		
		</c:when>
		<c:when test="${param.deletepage=='del'}">
			<sql:update dataSource="${db}">DELETE FROM emp WHERE ID = ${param.delete}</sql:update>
			<c:redirect url="index.jsp"></c:redirect>	
		</c:when>
		<c:when test="${param.update == 'up'}">
 			<sql:query var="rs" dataSource="${db}">SELECT * FROM emp WHERE id = ${param.id}</sql:query>
 			<c:choose>
 				<c:when test="${rs.rows != null}">
 					<sql:update dataSource="${db}">UPDATE emp SET id = ${param.id}, name1 = '${param.name}', designation = '${param.desg}' WHERE id = ${param.id};</sql:update>
 				<c:redirect url="index.jsp"></c:redirect>	
 				</c:when>
 			</c:choose>
			<c:forEach var='e' items="${rs.rows}">
				<c:set var="newID" value='${e.id}' scope="request"></c:set>
				<c:set var="newName" value='${e.name}' scope="request"></c:set>
				<c:set var="newDesg" value='${e.desg}' scope="request"></c:set>			
			</c:forEach>
			<c:redirect url="index.jsp"></c:redirect>
			<c:out value="Sriharivishnu"></c:out>	
		</c:when>
	</c:choose>	

</body>
</html>