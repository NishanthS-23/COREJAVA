<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ tagimport="java.util.List, com.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <title>Library Inventory Management</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; }
        table { width: 100%; border-collapse: collapse; margin-top: 20px; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }
        th { background-color: #f4f4f4; }
        .btn { padding: 6px 12px; text-decoration: none; border-radius: 4px; }
        .btn-add { background-color: #28a745; color: white; }
        .btn-edit { background-color: #ffc107; color: black; }
        .btn-delete { background-color: #dc3545; color: white; }
        .error-banner { color: #721c24; background-color: #f8d7da; padding: 10px; border: 1px solid #f5c6cb; border-radius: 4px; margin-bottom: 15px;}
    </style>
</head>
<body>

    <h2>Library Inventory Management Dashboard</h2>
    
    <% if (request.getAttribute("error") != null) { %>
        <div class="error-banner"><%= request.getAttribute("error") %></div>
    <% } %>

    <a href="new" class="btn btn-add">Add New Book</a>

    <table>
        <thead>
            <tr>
                <th>ID</th><th>Title</th><th>Author</th><th>Year</th><th>Quantity</th><th>Price</th><th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Book> listBook = (List<Book>) request.getAttribute("listBook");
                if (listBook != null && !listBook.isEmpty()) {
                    for (Book book : listBook) {
            %>
            <tr>
                <td><%= book.getId() %></td>
                <td><%= book.getTitle() %></td>
                <td><%= book.getAuthor() %></td>
                <td><%= book.getPubYear() %></td>
                <td><%= book.getQuantity() %></td>
                <td>$<%= String.format("%.2f", book.getPrice()) %></td>
                <td>
                    <a href="edit?id=<%= book.getId() %>" class="btn btn-edit">Edit</a>
                    <a href="delete?id=<%= book.getId() %>" class="btn btn-delete" onclick="return confirm('Delete this record permanently?');">Delete</a>
                </td>
            </tr>
            <% 
                    }
                } else { 
            %>
            <tr><td colspan="7" style="text-align:center;">No inventory matches located.</td></tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>