<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Details</title>
<style>
     body {
	background-color: aqua;
    }
    h1{
        text-align: center;
        color: black;
        font-family: 'Courier New', Courier, monospace;
        margin-top: 2vw;
    }  
    table{
        margin: 5vw 0 0 36vw;
        border-radius: 1vw 1vw 1vw 1vw;
	  border-spacing: 0;
	  border: 2px solid grey;
	  
    }
    th {
	  font-size: 1vw;
	  text-align: left;
	  padding: 1vw;
	  border:none;
	  font-family: Arial, Helvetica, sans-serif;
	  text-align: center;
      border-bottom: 2px solid grey;
	}

td {
border: none;
  font-size: 1vw;
  padding: 1vw;
  font-family: Arial, Helvetica, sans-serif;
  text-align: center;
  border-bottom: 2px solid grey;
}

tr:nth-last-child(1) td {
  border-bottom: none;
}

td a {
  text-decoration: none;
  color: blue;
}

td a:hover {
  color: orange;
}
</style>
</head>
<body>
<h1>Employees Details</h1>
<table>
<tr>
<th>Id</th>
<th>Name</th>  
<th>Designation</th>
<th>Salary</th>
<th>Actions</th>
</tr>

<c:forEach var="emp" items="${empList}">
<tr>
<td>${emp.eid}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.salary}</td>
<td><a href="editemp/${emp.eid}">Edit</a> &nbsp;&nbsp; <a href="deleteemp/${emp.eid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>






