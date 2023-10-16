<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h2>Update Task...</h2>
	<form action="update" method="post">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id"
					value="<%=request.getAttribute("id")%>"></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><input type="radio" name="status" value="Complete"
					<%="Complete".equals(request.getAttribute("status")) ? "checked" : ""%>>Complete</td>
				<td><input type="radio" name="status" value="Incomplete"
					<%="Incomplete".equals(request.getAttribute("status")) ? "checked" : ""%>>Incomplete</td>

			</tr>
			<tr>
				<td><input type="submit" value="Update Task"></td>
			</tr>
		</table>
	</form>
</body>
</html>