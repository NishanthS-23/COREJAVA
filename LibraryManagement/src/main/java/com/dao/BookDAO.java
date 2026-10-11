package com.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3000/library_db?useSSL=false";
    private String dbUser = "root";
    private String dbPassword = "password";

    protected Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found.", e);
        }
        return connection;
    }

    public void insertBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (title, author, pub_year, quantity, price) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setInt(3, book.getPubYear());
            statement.setInt(4, book.getQuantity());
            statement.setDouble(5, book.getPrice());
            statement.executeUpdate();
        }
    }

    public Book selectBook(int id) throws SQLException {
        Book book = null;
        String sql = "SELECT id, title, author, pub_year, quantity, price FROM books WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                book = new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getInt("pub_year"),
                    rs.getInt("quantity"),
                    rs.getDouble("price")
                );
            }
        }
        return book;
    }

    public List<Book> selectAllBooks() throws SQLException {
        List<Book> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try (Connection conn = getConnection(); PreparedStatement statement = conn.prepareStatement(sql); ResultSet rs = statement.executeQuery()) {
            while (rs.next()) {
                books.add(new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getInt("pub_year"),
                    rs.getInt("quantity"),
                    rs.getDouble("price")
                ));
            }
        }
        return books;
    }

    public boolean deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        }
    }

    public boolean updateBook(Book book) throws SQLException {
        String sql = "UPDATE books SET title = ?, author = ?, pub_year = ?, quantity = ?, price = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, book.getTitle());
            statement.setString(2, book.getAuthor());
            statement.setInt(3, book.getPubYear());
            statement.setInt(4, book.getQuantity());
            statement.setDouble(5, book.getPrice());
            statement.setInt(6, book.getId());
            return statement.executeUpdate() > 0;
        }
    }
}