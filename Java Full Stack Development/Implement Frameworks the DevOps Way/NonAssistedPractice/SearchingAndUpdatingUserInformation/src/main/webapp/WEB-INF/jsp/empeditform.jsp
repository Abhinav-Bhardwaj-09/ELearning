<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
    .formClass {
        padding: 2vw;
        text-align: center;
        width: fit-content;
        margin: 5vw 0 0 36vw;
        padding: 2vw;
    }  
    input{
        text-decoration: none;
        border: none;
        border-radius: 0.2vw;
        padding: 0.2vw;
        font-size: 1.2vw;
    }
    label {
        font-size: 1.2vw;
    }
    button{
        text-decoration: none;
        border: none;
        float: right;
        background-color: rgb(51, 214, 51);
        color: black;
        padding: 0.6vw;
        border-radius: .4vw;
        font-size: 0.9vw;
    }
     button:hover{ 
        background-color: rgb(19, 137, 19);
        color: white;
        padding: 0.6vw;
        border-radius: .4vw;
        font-size: 1.2vw;
    }
    </style>

<title>Edit Employee Information </title>
</head>
<body>
<h1> Edit Employee Information </h1>

<div class="formClass">
<form:form method="post" action="../editsave" modelAttribute="emp">
<table>
    <form:hidden path="eid"/>
<tr>
    <td><label>Employee Name : </label></td> 
    <td><form:input path="name" /></td>
</tr>
<tr>
   <td><label>Employee Designation : </label></td> 
    <td><form:input path="designation" /></td>
</tr>
<tr>
   <td><label>Employee Salary : </label></td> 
    <td><form:input path="salary" /></td>
</tr>

</table>

<button type="submit"> Update </button>
</form:form>
</div>

</body>
</html>