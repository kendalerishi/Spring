package com.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.LoginData;
import com.user.User;
import com.validation.Validation;

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
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		RegisterData regData = new RegisterData();
		regData.setUserName(request.getParameter("Username"));
		regData.setPassword(request.getParameter("Password"));
		regData.setConfirmpass(request.getParameter("ConfirmPass"));
		regData.setMobile(request.getParameter("Mobile"));
		regData.setEmail(request.getParameter("Email"));
		regData.setDob(request.getParameter("DOB"));
		
		User objUser = new User();
		StringBuffer errorMsg = isValidForm(regData);
		HttpSession session = request.getSession();
		if(errorMsg.length()==0)
		{
			session.setAttribute("UserName", regData.getUserName());
			//objUser.getUserList().add(new LoginData(regData.getUserName(),regData.getPassword()));
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
	        rd.forward(request, response);
		}
		else
		{
			session.setAttribute("Register_Error", errorMsg);
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
	        rd.forward(request, response);
		}
		
		
		
	}

	private StringBuffer isValidForm(RegisterData regData) {
		StringBuffer error = new StringBuffer("");
		Validation v = new Validation();
		if(v.usernamevalidator(regData.getUserName())==false)
		{
			error.append("Invalid UserName");
		}
		
		if(v.passwordValidation(regData.getPassword(),regData.getConfirmpass())==false)
		{
			error.append("____Invalid Password");
		}
		if(v.mobilevalidator(regData.getMobile())== false)
        {
            error.append("____Invalid Mobile Number");
        }
		if(v.emailvalidator(regData.getEmail())== false)
        {
            error.append("____Invalid Email");
        }
		if(v.datevalidator(regData.getDob())==false)
        {
            error.append("____Invalid BirthDate");
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
