<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="UTF-8">
<title>Searched Result</title>
</head>
<body>
<h1>Search Result</h1>
<table>
<tr>
<th>Id</th>
<th>Name</th>  
<th>Designation</th>
<th>Salary</th>
<th>Actions</th>
</tr>
<tr>
<td>${emp.eid}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.salary}</td>
<td><a href="editemp/${emp.eid}">Edit</a> &nbsp;&nbsp; <a href="deleteemp/${emp.eid}">Delete</a></td>
</tr>
</table>
</body>
</html>