<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Task...</title>
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
	<h2>Please Enter New Task</h2>
	<form action="create" method="post">
		<table>
			<tr>
				<td>Title</td>
				<td><input type="text" name="title" style="width: 300px;" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><textarea name="description"
						style="width: 300px; height: 150px;"></textarea></td>
			</tr>
			<tr>
				<td>Due_Date</td>
				<td><input type="date" name="date" /></td>
			</tr>
			<tr>
				<td>Status</td>
				<td><input type="checkbox" name="status" value="complete" />
					Complete <input type="checkbox" name="status" value="incomplete" />
					Incomplete</td>
			</tr>
			<tr>
				<td><input type="submit" value="Create Task" /></td>
			</tr>
		</table>
	</form>
	<%
	if (request.getAttribute("b") != null) {
		out.println(request.getAttribute("b"));
	}
	%>
	<a href="menu">Back To DashBoard</a>

</body>
</html>