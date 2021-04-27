<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<book:header/>
<div style="background-color : cyan; text-align: right">
<a href="/BookMyShow">Home</a>
</div>
<div style="background-color : orange; text-align: center; color: red">
<a href="addMovie.jsp">Add Movie</a><br>
<a href="updateMovie.jsp">Update Movie Price</a><br>
<a href="deleteMovie.jsp">Delete Movie</a><br>
</div>
<book:footer/>
</body>
</html>