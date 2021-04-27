<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Admin</title>
</head>
<body>
<book:header/>
<h2>Login User</h2>
<table>
<form action="loginServlet">
	<tr>
		<th>User Name : </th> <td><input type="text" name="username"></td>
	</tr>
	<tr>
		<th>User Password : </th> <td><input type="text" name="password"></td>
	</tr>
	<tr></tr>
	<tr>
		<th></th><td><input type="submit" value="Login"></td>
	</tr>
</form>
</table>
<book:footer/>
</body>
</html>