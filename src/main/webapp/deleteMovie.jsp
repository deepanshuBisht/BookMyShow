<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Movie</title>
</head>
<body>
	<h1>Delete Movie</h1>
<table>
	<form action="deleteServlet">
	<tr><td>Enter Movie ID : </td><td><input type="text" name="movieId"><br></td></tr>
	<tr><td><input type="submit" value="Delete Book"></td></tr>
	</form>
${message} 
</table>
</body>
</html>