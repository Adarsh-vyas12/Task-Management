<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All tasks</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h2 class="page-heading">Tasks List</h2>
	<table border=''>
		<tr>
			<th>Id</th>
			<th>Title</th>
			<th>Description</th>
			<th>Due_Date</th>
			<th>Status</th>
			<th>Action</th>
		</tr>
		<%
		ResultSet result = (ResultSet) request.getAttribute("res");
		while (result.next()) {
		%>
		<tr>
			<td><%=result.getString(1)%></td>
			<td><%=result.getString(2)%></td>
			<td><%=result.getString(3)%></td>
			<td><%=result.getString(4)%></td>
			<td><%=result.getString(5)%></td>
			<td><a href="delete?id=<%=result.getString(1)%>">Delete</a></td>
			<td><a
				href="update?id=<%=result.getString(1)%>&status=<%=result.getString(5)%>">Update</a></td>

		</tr>
		<%
		}
		%>
	</table>
	<a href="menu">Back To DashBoard</a>

</body>
</html>