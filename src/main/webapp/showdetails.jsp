<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Details</title>
</head>
<body>
<book:header/>
<div style="background-color : pink"><h2>Movie Details : </h2></div>
<div style="background-color : cyan">
<table  border="1" style="width:100%">
	<tr>
		<th>Movie ID</th>
	    <th>Title</th>
	    <th>Language</th>
	    <th>Duration</th>
		<th>Gener</th>
		<th>Director</th>
		<th>Actor</th>
		<th>Description</th>
	    <th>Price</th>
	</tr>
	<tr>
		<td>${movieDetail.movieId}</td> 
	    <td>${movieDetail.title }</td>
	    <td>${movieDetail.language}</td>
	    <td>${movieDetail.duration}</td>
	    <td>${movieDetail.gener}</td>
	    <td>${movieDetail.director}</td>
	    <td>${movieDetail.actor}</td>
	    <td>${movieDetail.description}</td>
	    <td>${movieDetail.moviePrice}</td>
  	</tr>
</table>
</div>
<book:footer/>
</body>
</html>