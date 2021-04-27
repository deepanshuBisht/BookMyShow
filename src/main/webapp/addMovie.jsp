<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Movie</title>
</head>
<body>
<book:header/>
<div style="background-color : pink"><h2>Add Book To DataBase : </h2></div><hr/>
<div style="background-color : cyan">
<table  style="width:100%" >
	<form action="addMovieServlet">
	<tr><td>Movie ID : </td><td><input type="text" name="movieId"><br></td></tr>
	<tr><td>Movie Title : </td><td><input type="text" name="title"><br></td></tr>
	<tr><td>Movie Language : </td><td><input type="text" name="language"><br></td></tr>
	<tr><td>Movie Duration : </td><td><input type="text" name="duration"><br></td></tr>
	<tr><td>Movie Gener : </td><td><input type="text" name="gener"><br></td></tr>
	<tr><td>Movie Director : </td><td><input type="text" name="director"><br></td></tr>
	<tr><td>Movie Actor : </td><td><input type="text" name="actor"><br></td></tr>
	<tr><td>Movie Description : </td><td><input type="text" name="description"><br></td></tr>
	<tr><td>Movie Price : </td><td><input type="text" name="moviePrice"><br></td></tr>
	<tr><td rowspan="2"><input type="submit" value="Add Movie"></td></tr>
	</form>
</table>
</div>
<book:footer/>
</body>
</html>