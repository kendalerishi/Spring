<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.books.Books" %>
<%@page import="com.books.BooksData" %> 
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList" %>  
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
</form>	<br>
<%
List<String> cartdata = (ArrayList<String>)session.getAttribute("CartList");
Books b = new Books();
List<BooksData> allBookList = b.bookList;
String Bookname="";
Float BookPrice = 0.0f;
int Quantity = 0;

	for(int i=0;i<cartdata.size();i++)
	{
		for(int j=0;j<allBookList.size();j++)
		{
			if(allBookList.get(j).getBook_id().equals(cartdata.get(i)))
			{
				if(Bookname.indexOf(allBookList.get(j).getBook_name())<0)
				{
					Bookname = Bookname.concat(allBookList.get(j).getBook_name())+","+" ";
				}
				BookPrice = BookPrice + Float.parseFloat(allBookList.get(j).getBook_price());
			}
		}
	}
%>

<table border="3">
	<tr><td>BookName</td><td>Quantity</td><td>TotalPrice</td></tr>
	<tr>
		<td><%=Bookname%></td>
		<td><%=cartdata.size()%></td>
		<td><%=BookPrice%></td>
	</tr>
</table>
<a href="Home.jsp">Home</a>
</body>
</html>