package com.demo.servletprg;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String username=request.getParameter("user");
		String password=request.getParameter("password");
		 if(password.equals("123"))
		 {
			 
			 Cookie c=new Cookie("Cookieuser",username);
			 c.setMaxAge(1800);
			 response.addCookie(c);
			 out.println("you are successfully login");	
			 RequestDispatcher dispatcher=request.getRequestDispatcher("Profileservlet");
			 dispatcher.forward(request, response);
			 
			  
		 }
		
		/*PrintWriter out=response.getWriter();
		if(username.equals("inmakes")&&password.equals("123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("LoginSucess.html");
			dispatcher.forward(request, response);*/
		/*	response.sendRedirect("http://google.com/");*/
		}
	/*	else {
			out.println("<h1 style=color:red;>"+"Sorry Invalid login"+"</h1>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("LoginForm .html");
			dispatcher.include(request, response);
		}
	}*/

}
