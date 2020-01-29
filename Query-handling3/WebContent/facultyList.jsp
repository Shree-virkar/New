<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>


 <html>
    <head>
        <title>Non-Technical Queries</title>
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="admin.css" >

    </head>

<body style = "background-color: #8585ad">
	
	<div class="container">
	<table class="table table-hover">
	
	<tr>
<th> Faculty Id</th>
<th>First Name</th>
<th>Last Name</th>
</tr>
	
	
<c:forEach var="v" items="${requestScope.facultyList}"> 




<tr>
<td>
${v.faculty_id}
</td>
<td>${v.first_name}</td>
<td>${v.last_name}</td>
<td> <a href="<spring:url value='/admin/removeFaculty?faculty_id=${v.faculty_id}'/>">Delete</a></td>
</tr>



</c:forEach>
	
	</table>
	
	</div>
</body>
</html>