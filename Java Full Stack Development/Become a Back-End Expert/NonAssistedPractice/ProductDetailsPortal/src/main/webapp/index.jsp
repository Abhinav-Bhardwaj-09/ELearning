<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>

<!--
<form action="AddProductServlet"> => To use Servlet to capture form data & store in the session

<form action="AddProd.jsp">	   => To use JSP to capture form data and store in the session
--> 

<form action="AddProd.jsp">
Enter Product Name: <input type="text" name="pName"> <br>
Enter Product Price: <input type="text" name="pPrice"><br>
Enter Product Quantity: <input type="text" name="pQty"><br>
<input type="submit" value="Add Product">
</body>
</html>