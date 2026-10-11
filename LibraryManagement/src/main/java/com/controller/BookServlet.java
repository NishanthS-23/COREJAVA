package com.controller;

import com.dao.*;
import com.model.Book;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/")
public class BookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private BookDAO bookDAO;

    public void init() {
        bookDAO = new BookDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertBook(request, response);
                    break;
                case "/delete":
                    deleteBook(request, response);
                    break;
                case "/edit":
                    showEditForm(request, response);
                    break;
                case "/update":
                    updateBook(request, response);
                    break;
                default:
                    listBooks(request, response);
                    break;
            }
        } catch (Exception ex) {
            handleException(request, response, ex);
        }
    }

    private void listBooks(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        List<Book> listBook = bookDAO.selectAllBooks();
        request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("book-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Book existingBook = bookDAO.selectBook(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("book-form.jsp");
        request.setAttribute("book", existingBook);
        dispatcher.forward(request, response);
    }

    private void insertBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        try {
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            int pubYear = Integer.parseInt(request.getParameter("pubYear"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            double price = Double.parseDouble(request.getParameter("price"));

            if(pubYear < 0 || quantity < 0 || price < 0) {
                throw new IllegalArgumentException("Values cannot be negative.");
            }

            Book newBook = new Book(title, author, pubYear, quantity, price);
            bookDAO.insertBook(newBook);
            response.sendRedirect("list");
        } catch (IllegalArgumentException e) {
            request.setAttribute("error", "Invalid numeric details input. Please check your data.");
            showNewForm(request, response);
        }
    }

    private void updateBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            int pubYear = Integer.parseInt(request.getParameter("pubYear"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            double price = Double.parseDouble(request.getParameter("price"));

            if(pubYear < 0 || quantity < 0 || price < 0) {
                throw new IllegalArgumentException("Values cannot be negative.");
            }

            Book book = new Book(id, title, author, pubYear, quantity, price);
            bookDAO.updateBook(book);
            response.sendRedirect("list");
        } catch (IllegalArgumentException e) {
            request.setAttribute("error", "Invalid numeric details input. Update failed.");
            Book existingBook = bookDAO.selectBook(id);
            request.setAttribute("book", existingBook);
            RequestDispatcher dispatcher = request.getRequestDispatcher("book-form.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void deleteBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        bookDAO.deleteBook(id);
        response.sendRedirect("list");
    }

    private void handleException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws ServletException, IOException {
        request.setAttribute("error", "Database application conflict: " + ex.getMessage());
        try {
            List<Book> listBook = bookDAO.selectAllBooks();
            request.setAttribute("listBook", listBook);
        } catch (Exception systemErr) {
            request.setAttribute("error", "System critical initialization failure.");
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}