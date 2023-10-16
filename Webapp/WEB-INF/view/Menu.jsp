<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DashBoard</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h2 class="page-heading">DashBoard</h2>
	<%
	String userEmail = (String) session.getAttribute("userEmail");
	if (userEmail != null) {
	%>
	<p>
		Hi
		<%=userEmail%></p>
	<%
	}
	%>

	<a href="view">View Task List</a>
	<a href="create">Create new Task</a>

	<form action="logout" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>