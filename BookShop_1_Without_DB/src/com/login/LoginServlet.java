package com.login;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		LoginData data = new LoginData();
		data.setUsername(request.getParameter("Username"));
		data.setPassword(request.getParameter("Password"));
		
		User objUser = new User();
		List<LoginData> userList = objUser.getUserList();
		//userList.forEach(name->out.print(name.getUsername()+"	"+name.getPassword()+"\n"));
		boolean isValidUser = false;
		for(int i=0;i<userList.size();i++)
		{
			if((userList.get(i).getUsername().equals(data.getUsername()))&&(userList.get(i).getPassword().equals(data.getPassword())))
			{
				isValidUser = true;
				break;
			}
		}
		HttpSession session = request.getSession();
		if(isValidUser==true)
		{
			//New code to take user to Home page ... also to display user name on all pagesso put it in session
			session.setAttribute("UserName", data.getUsername());
			Cookie newCookie = new Cookie("Username",data.getUsername());
			newCookie.setMaxAge(60*60);
			response.addCookie(newCookie);
			
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request,response);
			// Old code to check flow 
//			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//			rd.forward(request,response);
		}
		else
		{
			session.setAttribute("LOGIN_ERROR", "Invalid Username/Password");
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			rd.forward(request,response);
		}
		
		// C0 starts   // Code for regular Success and Error page transfer
//		if(!(request.getParameter("Username").equals("Rishi")) || (!(request.getParameter("Password").equals("Rishi"))))
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
//			rd.forward(request,response);
//		}
//		if((request.getParameter("Username").equals("Rishi"))&&(request.getParameter("Password").equals("Rishi")))
//		{
//			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//			rd.forward(request,response);
//		}
		// C0 Ends
		
	     //C1 Starts	// Code to validate id n pass from userList .... NOT WORKING
//		for(int i=0;i<userList.size();i++)
//		{
//			if((userList.get(i).getUsername().equals(user))&&(userList.get(i).getPassword().equals(pass)))
//			{
//				RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//				rd.forward(request,response);
//			}
//		}
//
//		for(int i=0;i<userList.size();i++)
//		{
//			if(!((userList.get(i).getUsername().equals(user))||(userList.get(i).getPassword().equals(pass))))
//			{
//				RequestDispatcher rd1 = request.getRequestDispatcher("Error.jsp");
//				rd1.forward(request,response);
//			}
//		}
		//C1 Ends
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}
	
}