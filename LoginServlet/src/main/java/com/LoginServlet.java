package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 //getting username and password
		 String uname=request.getParameter("username");
		 String pass=request.getParameter("password");
		 
		 //hard coded validation
		 if(uname.equals("admin")&& pass.equals("1234"))
		 {
			 out.println("<h2>Login Successul</h2>");
		 }
		 else {
			 out.println("<h2>Invalid Username or password</h2>");
			 
		 }
		
	}

}
