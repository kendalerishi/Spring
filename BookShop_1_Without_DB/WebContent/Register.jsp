<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:blue"> Registration form for new user. Please enter below details.</h1>
<form action="RegisterServlet" method="post">
<table border="10" style="margin-left: 10%;margin-top: 3%">
	<tr>
		<td>UserName</td>
		<td><input type="text" name="Username"></td>
	</tr>
	<tr>
		<td>PassWord</td>
		<td><input type="text" name="Password"></td>
	</tr>
	<tr>
		<td>Confirm Password</td>
		<td><input type="text" name="ConfirmPass"></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="text" name="Email"></td>
	</tr>
	<tr>
		<td>D.O.B.</td>
		<td><input type="text" name="DOB"></td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center"><input type="Submit" value="Submit"></td>
	</tr>
	<%
		
		if(session.getAttribute("Register_Error")!=null)
		{
	%>
		<tr>
			<td colspan="2"> <%=session.getAttribute("Register_Error") %>	</td>
		</tr>
	
	<% 
		} 
	%>
</table>
</body>
</html>