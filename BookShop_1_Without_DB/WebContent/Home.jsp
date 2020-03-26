<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.books.Books" %>
<%@page import="com.books.BooksData" %> 
<%@page import="java.util.List"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="font-size=100%;text-align: right;color:red"> Welcome : <%=(String)session.getAttribute("UserName")%> </h1>

<form action="URLController" method="post" style="text-align: right;font-size:150%;color:red"> 
	<input type="submit" value="Log Out" name="logout">
</form>
<h1 style="color:blue; font-size:125%">Available books: </h1>
<table border="10">
<tr>
<td>Name</td> <td>Publication</td> <td>Edition</td> <td>Price</td> <td>Author</td><td style="text-align:center">Action</td>
</tr>
<%	
	Books objBooks = new Books();
	List<BooksData> booksList = objBooks.bookList;
	for(int i=0;i<booksList.size();i++)
	{
%>
	<tr>
	<td> <%= booksList.get(i).getBook_name() %></td>
	<td> <%= booksList.get(i).getBook_publication() %></td>
	<td> <%= booksList.get(i).getBook_Edition() %></td>
	<td> <%= booksList.get(i).getBook_price() %></td>
	<td> <%= booksList.get(i).getBook_Autor() %></td>
	<td>
		<form action ="URLController" method="post">
		<input type="text" name="BID" value="<%=booksList.get(i).getBook_id()%>">
		<input type="submit" name="AddToCart" value="AddToCart">
		<input type="submit" name="BookDetails" value="BookDetails">
<%--		<input type="submit" name="Buy" value="Buy"> --%>
		</form>
	</td>	
	</tr>	
<% 
} %>
</table>

</body>
</html>