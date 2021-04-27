<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Movie Price</title>
</head>
<body>
<body>
	<h1>Update Movie Price</h1>
	<h4>Enter Movie ID to Update its Price</h4>
<table>
	<form action="updateMovieServlet">
	<tr><td>Enter Movie ID : </td><td><input type="text" name="movieId"><br></td></tr>
	<tr><td><input type="submit" value="Get Movie"></td></tr>
	</form>
${message} 
</body>
</html>