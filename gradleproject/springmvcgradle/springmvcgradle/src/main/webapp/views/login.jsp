<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
		<h2>Login Page</h2>
		${SPRING_SECURITY_LAST_EXCEPTION.message}
		<form action="login" method="POST">
		<table>
			<tr>
				<td>UserName : </td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password : </td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td colspan="2"><button type="submit">Login</button></td>
			</tr>
		</table>
		</form>
		
	</div>
</body>
</html>