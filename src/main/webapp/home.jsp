<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home BOOKMYSHOW</title>
</head>
<body>
<book:header/>
<div style="background-color : pink; text-align: right">
	<a href="login.jsp">Login Here</a>
</div>
<hr/>
<div>
<form action="searchServlet">
	Search : <input type="text" name="choice">
	<input type="submit" value="Search">
</form>
</div>
<hr/>
<br>
<div style="background-color : cyan">
<c:choose>
<c:when test="${empty movieList  }">
  ${message}<a href="/BookMyShow" style="text-align: center">Home</a>
</c:when>
<c:otherwise>
<table style="width:100%">
  <tr>
    <th>Title</th>
    <th>Language</th>
    <th>Duration</th>
    <th></th>
    <th>Details</th>
  </tr>
<c:forEach var="movie" items="${ movieList }">
  <tr>
  <form action = "viewServlet">
    <td>${movie.title }</td>
    <td>${movie.language }</td>
    <td>${movie.duration}</td>
    <td><input type="hidden" value = "${movie.movieId}" name="movieid"></td> 
    <td><input type="submit" value="View"></td>
   </form>
  </tr>
  </c:forEach>
</table>
</c:otherwise>
</c:choose>
</div>
<br>
<book:footer/>
</body>
</html>