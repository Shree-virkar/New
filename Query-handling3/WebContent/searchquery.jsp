<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Queries related to topic</h2>
<p>
	<table  width="100%" border="1" id="listq;">
                    <tr>
                      <th>Question</th>
                    </tr>
                    <c:forEach var="query" items="${listQuery}" varStatus="status">
                <tr>
   
                    <td><a href="">${query.question}</a>
                
                             
                </tr>
                </c:forEach>       
</p>
</body>
</html>