<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
<link rel="stylesheet" href="Common.css">
</head>
<body style="margin-left:5%;margin-top:5%">
<h1 style="color:blue">Welcome to Bookmall	!!! </h1>
	
	<img src="https://previews.123rf.com/images/larafields/larafields1802/larafields180200014/94906986-book-shop-front-vector-illustration-colorful-flat-style-facade-of-book-store.jpg" style="width:256px;height:256px; alt="Image will be uploaded soon !!!">
	<!--  <img src="F:\bookshop.jpg" alt="Image will be uploaded soon !!!"> -->
	<form action="LoginServlet" method="post">
		<table border="10" style="width:200px;height:140px;">
			<tr>
				<td>USERNAME</td><td><input type="text" name="Username" placeholder="username" required></td>
			</tr>
			<tr>
				<td>PASSWORD</td><td><input type="password" name="Password" placeholder="password" required></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit">
				<a href="Register.jsp"><b><i>New User</b></i></td>
			</tr>
	<%
		if(((String)session.getAttribute("LOGIN_ERROR")!=null))
		{ %> 
		<tr> <td colspan="2"><%=session.getAttribute("LOGIN_ERROR") %></td> </tr><%		
		}
		%>		
		</table>
	
	</form>
	
	
</body>
</html>