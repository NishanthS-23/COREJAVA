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
 * Servlet implementation class ClearServlet
 */
@WebServlet("/ClearServlet")
public class ClearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession(false);
		String user= (String) session.getAttribute("Sessionuser");
		out.println("<h1>"+user+" You are sucesscefully loged out<h1>");
		
		long creationTime=session.getCreationTime();
		long lastAccessTime=session.getLastAccessedTime();
		
		Calendar cal=Calendar.getInstance();
		out.println("<h2>Session creation time="+(creationTime/1000)+"</h2>");
		out.println("<h2>Session last Access Time ="+(lastAccessTime/1000)+"</h2>");
		
		long currentTime=cal.getTimeInMillis();
		long totalTime=(currentTime-creationTime)/1000;
		out.println("<h2>Total time spend="+totalTime+"</h2>");
		session.invalidate();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
