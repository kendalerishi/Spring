<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Common.css">
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body style="margin-left:5%;margin-top:5%">
<h1>Welcome to Bookmall	!!! </h1>
	
	<form action="LoginServlet" method="post">
		<table border="10">
			<tr>
				<td>USERNAME</td><td><input type="text" name="Username"></td>
			</tr>
			<tr>
				<td>PASSWORD</td><td><input type="password" name="Password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit">
				<a href="Register.jsp">New User</td>
			</tr>
	<%
		if(((String)session.getAttribute("LOGIN_ERROR")!=null))
		{ %> 
		<tr> <td colspan="2" style="color:red"><%=session.getAttribute("LOGIN_ERROR") %></td> </tr><%		
		}
		%>		
		</table>
	
	</form>
	
	
</body>
</html>