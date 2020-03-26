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

<% 
	Books objBooks = new Books();
	List<BooksData> booksList = objBooks.bookList;
	for(int i=0;i<booksList.size();i++)
	{ 
		if(booksList.get(i).getBook_id().equals(request.getParameter("BID")))	
		{  %> <table border="5">
		<tr><td>BookID<td><td><%=request.getParameter("BID")%></td></tr>
		<tr><td>Name<td><td><%=booksList.get(i).getBook_name() %></td></tr>
		<tr><td>Publication<td><td><%=booksList.get(i).getBook_publication()%></td></tr>
		<tr><td>Edition<td><td><%=booksList.get(i).getBook_Edition()%></td></tr>
		<tr><td>Book Price<td><td><%=booksList.get(i).getBook_price()%></td></tr>
		<tr><td>Author<td><td><%=booksList.get(i).getBook_Autor()%></td></tr>
		</table>
<%  }
		}
%>	
</body>
</html>