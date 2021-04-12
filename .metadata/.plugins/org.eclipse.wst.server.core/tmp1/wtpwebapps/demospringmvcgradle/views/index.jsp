<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title> Product Manager </title>
</head>
<body>
		<div align="center">
    <h1>Product List</h1>
    <a href="/new">Create New Product</a>
    <br/><br/>
    <table border="1" cellpadding="10">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Made In</th>
                <th>Price</th>
                <th>Actions</th>
           </tr>
        </thead>
        <tbody>
       <c:forEach items="${listProducts}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.brand}</td>
                <td>${product.madein}</td>
                <td>${product.price}</td>
                <td>
                    <a href="/edit?id=${product.id}">Edit</a> 
						&nbsp;&nbsp;&nbsp; 
					<a href="/delete?id=${product.id}">Delete</a>
                </td>
            </tr>
         </c:forEach>
        </tbody>
    </table>
</div>   
</body>
</html>