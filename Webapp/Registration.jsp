<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h2>Please Fill Your Details Here...</h2>
	<form action="reg" method="post">
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" required="required" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required="required" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>
	<a href="Login.jsp">Back To Login</a>
	<%
	if (request.getAttribute("a") != null) {
		out.println(request.getAttribute("a"));
	}
	%>
</body>
</html>