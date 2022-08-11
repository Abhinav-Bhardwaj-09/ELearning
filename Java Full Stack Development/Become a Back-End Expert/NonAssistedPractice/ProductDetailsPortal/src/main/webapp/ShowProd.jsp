<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.ProductDetails.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product details</title>
</head>
<body>
<jsp:useBean id="obj" class="com.ProductDetails.Product" 
scope="session" />
<table border=2>
<tr>
 <td><jsp:getProperty property="pName" name="obj"/></td>
 <td><jsp:getProperty property="pPrice" name="obj"/></td>
 <td><jsp:getProperty property="pQty" name="obj"/></td>
<tr>
</table>
</body>
</html>