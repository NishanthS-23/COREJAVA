package com.dome.servletexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String username=req.getParameter("txtuser");
		String password=req.getParameter("txtpwd");
		
		HttpSession session=req.getSession();
		session.setAttribute("Sessionuser", username);
		Integer visitcount=1;
		if (session.isNew())
		{
		session.setAttribute("visitcount", visitcount);	
		}
		else
		{
			visitcount=(Integer) session.getAttribute("visitcount");
			visitcount=visitcount+1;
			session.setAttribute("visitcount", visitcount);
		}
		
		out.println("<h1 style='color:green'>Welcome "+session.getAttribute("Sessionuser")+" you are successfully login</h1>");
		out.println("<h2>Session ID="+session.getId()+"</h2>");
		out.println("<h2>visit count="+visitcount+"</h2>");
		out.println("<h2>click here to <a href='ClearServlet'>invalidate</a>");
		
		
	}

}
