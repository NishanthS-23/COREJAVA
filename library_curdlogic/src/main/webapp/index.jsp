<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body>
    <h2>Library Inventory Management</h2>
    
    <!-- Form to Add/Edit Book -->
    <form action="insert" method="post">
        <input type="text" name="title" placeholder="Title" required />
        <input type="text" name="author" placeholder="Author" required />
        <input type="number" name="pubYear" placeholder="Year" required />
        <input type="number" name="quantity" placeholder="Qty" required />
        <input type="number" step="0.01" name="price" placeholder="Price" required />
        <button type="submit">Add Book</button>
    </form>

    <hr>
    <table border="1">
        <tr>
            <th>ID</th><th>Title</th><th>Author</th><th>Year</th><th>Qty</th><th>Price</th><th>Actions</th>
        </tr>
        <c:forEach var="book" items="${listBook}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.pubYear}</td>
                <td>${book.quantity}</td>
                <td>${book.price}</td>
                <td>
                    <a href="edit?id=${book.id}">Edit</a>
                    <a href="delete?id=${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>