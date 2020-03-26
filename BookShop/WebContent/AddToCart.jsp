<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.books.Books" %>
<%@page import="com.books.BooksData" %> 
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList" %>     
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Common.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="font-size=100%;text-align: right;margin-right:30%;color:brown"> Welcome : <%=(String)session.getAttribute("UserName")%> </h1>

<form action="URLController" method="post" style="text-align: right;margin-right:30%;font-size:150%;color:red"> 
	<input type="submit" value="Log Out" name="logout"> 
</form>	<br>

Items In the Cart  <br>
<br>
    <table border="2">
            <tr><td>Book ID</td><td>Name</td><td>Publication</td><td>Edition</td><td>Price</td><td>Author</td></tr>
<%
	Books objb = new Books();
	List<BooksData> allBooksList = objb.bookList;
	List<String> data = new ArrayList<String>();
	
	data = (ArrayList<String>)session.getAttribute("CartList");
	
	for(int i=0;i<data.size();i++)
	{
		for(int j=0;j<allBooksList.size();j++)
		{
			if(allBooksList.get(j).getBook_id().equals(data.get(i)))
			{
			%>
			<tr>
				<td><%=allBooksList.get(j).getBook_id()%></td>
				<td> <%=allBooksList.get(j).getBook_name() %></td>
                <td> <%=allBooksList.get(j).getBook_publication() %></td>
                <td><%=allBooksList.get(j).getBook_Edition() %></td>
                <td><%=allBooksList.get(j).getBook_price() %></td>
                <td> <%=allBooksList.get(j).getBook_Autor() %></td>
			</tr>
		<%	}
		}
	}
%>
</table>
<a href="Home.jsp">Home</a>
<a href="Buy.jsp">Buy</a>
</body>
</html>