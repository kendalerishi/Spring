<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!@ page import="java.util.ArrayList";%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loginjsp jap file</title>
</head>
<body>
	<h1>I am Loginjsp.jsp</h1>
	<p>Paragraph for Loginjsp.jsp</p>
	<!-- WAP arraylist in jsp page using jps tags -->
	<%! int[] al = {1,2,30,50,8};  %>
	<table border="20">
	<% for(int i=0;i<al.length;i++)
		{ 
	%>
	<tr>	
		<td> <%  out.print(al[i]+"<br>");%> </td>
	</tr>
	<% }
	%>	
	</table>
</body>
</html>