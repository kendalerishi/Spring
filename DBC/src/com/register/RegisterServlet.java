package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbc.DBController;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
		out.print("Servlet Called");
	    RegisterData regData = new RegisterData();
		regData.setUserName(request.getParameter("Username"));
		regData.setPassword(request.getParameter("Password"));
		regData.setConfirmpass(request.getParameter("ConfirmPass"));
		regData.setMobile(request.getParameter("Mobile"));
		regData.setEmail(request.getParameter("Email"));
		regData.setDob(request.getParameter("DOB"));
		
		if(DBController.objDBC.getConnection()!=null)
			out.print("connected server");
		if(DBController.objDBC.getConnection()==null)
			out.print("connected not server");
		
		StringBuffer errorMsg = isValidForm(regData);
		if(errorMsg.length()==0) 
	       {
//	           DBController.getObj().user_Registration_Data(regData);
//			   out.print("IF CALLED");
	           DBController.objDBC.user_Registration_Data(regData);
//			   RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
//	           rd.forward(request, response);
	          
	        }
	        else
	        {
	        out.print("ELSE");
	           RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
	           rd.forward(request, response);
	        }				
	}
		
	StringBuffer isValidForm(RegisterData regData)
    {
        StringBuffer error = new StringBuffer("");
        Validation v = new Validation();
        if(v.usernamevalidator(regData.getUserName())== false)
        {
            error.append("Invalid UserName");
        }
        if(v.emailvalidator(regData.getEmail())== false)
        {
            error.append("____Invalid Email");
        }
        if(v.datevalidator(regData.getDob())==false)
        {
            error.append("____Invalid BirthDate");
        }
        if(v.passwordValidation(regData.getPassword(), regData.getConfirmpass())== false)
        {
                 error.append("____Password and Confirm password not match");   
        }
        return error;
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
