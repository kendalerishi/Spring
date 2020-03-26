<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login HTML File</title>
</head>

<body style="background-color:red">
	<h1 style="text-align:center">	heading		</h1>
	<p>	Start writing paragraph here	</p>
	<a href="Loginjsp.jsp"> Next Page</a>  
<!-- next we will see html table -->

	<table border="20">
		<tr>
			<td>Ename</td>
			<td><input type="text" name="ename"></td>
		</tr>
		<tr>
			<td>EId</td>
			<td><input type="text" name="eid"></td>
		</tr>
		<tr>
			<td>City</td>
			<td><select name="city">
				<option value="Pune">PUNE</option>
				<option value="Mumbai">MUMBAI</option>
			</td>
		</tr>
		<tr><td><button style="text-aligh="center">Click Me</td>
		</tr>
	</table>
</body>
</html>