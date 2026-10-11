package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.dao.StudentDAO;
import com.model.Student2;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Student2 s;	
	StudentDAO dao;
	int count=0;
	RequestDispatcher dispatcher;
       
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String command=request.getParameter("action");
		System.out.println(command);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int regno=Integer.parseInt(request.getParameter("txtregno"));
		String name=request.getParameter("txtname");
		int age=Integer.parseInt(request.getParameter("txtage"));
		String gender=request.getParameter("txtgender");
		String dept=request.getParameter("dept");
		/*
		System.out.println(regno);
		System.out.println(name);
		*/
		s=new Student2();
		s.setRegno(regno);
		s.setStudent_name(name);
		s.setAge(age);
		s.setGender(gender);
		s.setDept(dept);
		
		dao=new StudentDAO();
		count=dao.addStudent(s);
		 if (count!=0)
		 {
			 out.println("1 Record inserted");
			 dispatcher=request.getRequestDispatcher("StudentRegistration.jsp");
			 dispatcher.include(request, response);
			 
		 }
		 else
		 {
			 out.println("0 Record inserted");
			 dispatcher=request.getRequestDispatcher("StudentRegistration.jsp");
			 dispatcher.include(request, response);
			 
		 }
		
	}

}
