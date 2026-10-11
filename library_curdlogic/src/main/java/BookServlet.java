

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private String jdbcURL="jdbc:mysql://localhost:3306/library_db";
	private String jdbcUsername="root";
	private String jdbcpassword="Nishanth@2312";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		try {
			switch (action) {
			case "/insert":insertBook(request,response);break;
			case "/delete":deleteBook(request,response);break;
			case "/edit":showEditBook(request,response);break;
			case "/update":UpdateBook(request,response);break;
			default:listBooks(request,response);break;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		// TODO Auto-generated method stub
		List<Book>listBook=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","Nishanth@2312");
		ResultSet rs=con.createStatement().executeQuery("SELECT * from books");
		while(rs.next()) {
			listBook.add(new Book(rs.getInt("id"),rs.getString("title"),
					rs.getString("author"),rs.getInt("pub_year"),rs.getInt("quantity"),rs.getDouble("price")));
		}
		    request.setAttribute("listBook", listBook);
			request.getRequestDispatcher("index.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private void insertBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		int year=Integer.parseInt(request.getParameter("pubYear"));
		int qyt=Integer.parseInt(request.getParameter("quantity"));
		double price=Double.parseDouble(request.getParameter("price"));
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","Nishanth@2312");
		
		PreparedStatement ps=con.prepareStatement("INSERT INTO books(title,author,pub_year,quantity,price)VALUES(?,?,?,?,?)");
		ps.setString(1, title);
		ps.setString(2, author);
		ps.setInt(3, year);
		ps.setInt(4, qyt);
		ps.setDouble(5, price);
		response.sendRedirect("list");
	}
       

	private void UpdateBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		int year=Integer.parseInt(request.getParameter("pubYear"));
		int qyt=Integer.parseInt(request.getParameter("quantity"));
		double price=Double.parseDouble(request.getParameter("price"));
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","Nishanth@2312");
		
		PreparedStatement ps=con.prepareStatement("UPDATE books SET title=?,author=?,pub_year=?,quantity=?,price=?WHERE id=?");
		ps.setString(1, title);
		ps.setString(2, author);
		ps.setInt(3, year);
		ps.setInt(4, qyt);
		ps.setDouble(5, price);
		int id = 0;
		ps.setInt(6, id);
		ps.executeUpdate();
		response.sendRedirect("list");
		// TODO Auto-generated method stub
		
	}


	private void showEditBook(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id")) ;
		
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db","root","Nishanth@2312");
		PreparedStatement ps=con.prepareStatement("DELETE FROM books WHERE id=?");
		ps.setInt(1,id);
		ps.executeUpdate();
		response.sendRedirect("list");
	}


	
}
