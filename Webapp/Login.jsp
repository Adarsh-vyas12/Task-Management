<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h2>Login Here...</h2>
	<form action="login" method="post">
		Email<input type="text" name="email" /> Password<input
			type="password" name="password" /> <input type="submit"
			value="Login" />
	</form>
	<a href="Registration.jsp">Register</a>
	<%
	if (request.getAttribute("error") != null) {
		out.println(request.getAttribute("error"));
	}
	%>
</body>
</html>