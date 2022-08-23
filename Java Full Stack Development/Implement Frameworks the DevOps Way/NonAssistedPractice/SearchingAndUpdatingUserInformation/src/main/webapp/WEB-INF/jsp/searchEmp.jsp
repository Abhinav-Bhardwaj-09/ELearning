<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

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
<meta charset="UTF-8">
<title>Search Employee</title>
</head>
<body>
<h1> Search Employee Information</h1>
<div class="formClass">
<form method="get" action="searchhEmp" >
<label>Employee Id: </label>
<input name="eid" />
<br>
<button type="submit"> Search </button>
</form>
</div>

</body>
</html>