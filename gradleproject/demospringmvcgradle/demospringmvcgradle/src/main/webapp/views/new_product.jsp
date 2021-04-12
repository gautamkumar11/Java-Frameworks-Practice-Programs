<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>New Product</title>
</head>
<body>
	<div align = "center">
		<h2>Create New Product</h2>
		<form action="save">
		<table>
			<tr>
				<td>Product Name : </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Brand : </td>
				<td><input type="text" name="brand"></td>
			</tr>
			<tr>
				<td>Made In : </td>
				<td><input type="text" name="madein"></td>
			</tr>
			<tr>
				<td>Price : </td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">Save</button></td>
			</tr>
		</table>
		</form>
		
	</div>
</body>
</html>