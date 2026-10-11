<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.model.Book" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Management</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 30px; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; font-weight: bold;}
        input[type="text"], input[type="number"] { width: 300px; padding: 8px; border: 1px solid #ccc; border-radius: 4px; }
        .btn-submit { background-color: #007bff; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer; }
        .error-banner { color: #721c24; background-color: #f8d7da; padding: 10px; border: 1px solid #f5c6cb; border-radius: 4px; width:300px; margin-bottom: 15px;}
    </style>
</head>
<body>

    <% 
        Book book = (Book) request.getAttribute("book"); 
        boolean isEdit = (book != null);
    %>

    <h2><%= isEdit ? "Edit Existing Asset Profile" : "Register New Asset" %></h2>

    <% if (request.getAttribute("error") != null) { %>
        <div class="error-banner"><%= request.getAttribute("error") %></div>
    <% } %>

    <form action="<%= isEdit ? "update" : "insert" %>" method="post">
        <% if (isEdit) { %>
            <input type="hidden" name="id" value="<%= book.getId() %>" />
        <% } %>

        <div class="form-group">
            <label>Title:</label>
            <input type="text" name="title" value="<%= isEdit ? book.getTitle() : "" %>" required />
        </div>
        <div class="form-group">
            <label>Author:</label>
            <input type="text" name="author" value="<%= isEdit ? book.getAuthor() : "" %>" required />
        </div>
        <div class="form-group">
            <label>Publication Year:</label>
            <input type="number" name="pubYear" min="1000" max="2100" value="<%= isEdit ? book.getPubYear() : "" %>" required />
        </div>
        <div class="form-group">
            <label>Quantity Available:</label>
            <input type="number" name="quantity" min="0" value="<%= isEdit ? book.getQuantity() : "" %>" required />
        </div>
        <div class="form-group">
            <label>Price:</label>
            <input type="number" step="0.01" min="0.00" name="price" value="<%= isEdit ? book.getPrice() : "" %>" required />
        </div>
        
        <button type="submit" class="btn-submit">Save Book</button>
        <a href="list" style="margin-left:10px; text-decoration:none; color:#333;">Cancel</a>
    </form>
</body>
</html>