package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Initial_App_Servlet
 */
@WebServlet("/Initial_App_Servlet")
public class Initial_App_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Initial_App_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		boolean newUser = true;
		
		Cookie[] cookie = request.getCookies();
//		for(Cookie c : cookie)
//		{
//			out.print(c);
//		}
		if(cookie!=null)
		{
			for(int i=0; i<cookie.length;i++)
			{
				Cookie c = cookie[i];
				if(c.getName().equals("Ram"))
				{
					HttpSession session = request.getSession();
					session.setAttribute("Username", c.getValue());
					RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
	                rd.forward(request, response);
				}
			
			}
		}
		
		if(newUser==true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
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
