package com.url;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class URLController
 */
@WebServlet("/URLController")
public class URLController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public URLController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		//out.print("Servlet called");
		String Book_id = request.getParameter("BID");
		String AddToCart = request.getParameter("AddToCart");
		String BookDetails = request.getParameter("BookDetails");
		String Buy = request.getParameter("Buy");
		String logout = request.getParameter("logout");
		//out.print(Book_id);
		if(logout!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("LogoutServlet");
			rd.forward(request, response);		
		}
		
		if(BookDetails!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("BookDetails.jsp");
			rd.forward(request, response);		
		}
		
		if(AddToCart!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("CartServlet");
			rd.forward(request, response);		
		}
		
		if(Buy!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Buy.jsp");
			rd.forward(request, response);	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
