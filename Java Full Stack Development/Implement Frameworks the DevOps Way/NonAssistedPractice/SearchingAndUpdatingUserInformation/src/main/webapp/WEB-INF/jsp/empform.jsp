<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

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
</head>
<body>
		<h1>Add New Employee</h1>
       <div class="formClass">
        <fm:form method="post" action="save" modelAttribute="emp">  
      	<table >
      	<tr>  
          <td><label>Employee Id</label> : </td> 
          <td><fm:input path="eid"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><fm:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><fm:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><fm:input path="designation" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><button type="submit">Save</button></td>  
         </tr>  
        </table>  
       </fm:form>  
       </div>

</body>
</html>