<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student registration</title>
</head>
<body>
<h1>Student registration</h1>
<form action="RegisterServlet" method="post">
<table>
<tr>
 <td> Enter the register number </td>
  <td><input type="number" name="txtregno">
</tr>
<tr>
  <td> Enter the student name </td>
    <td><input type="text" name="txtname">
</tr>
<tr>
  <td> Enter the age </td>
   <td><input type="number" name="txtage">
</tr>
<tr>
  <td> Select the gender </td>
   <td><input type="radio" name="txtgender" value="male" checked="checked">male
   <td><input type="radio" name="txtgender" value="female">female
</tr>
<tr>
<td> Select dept </td>
  <td><select name="dept">
   <option value="civil">civil</option>
   <option value="mech">Mech</option>
   <option value="cse" selected="selected">CSE</option>
   <option value="it">it</option>
</select>
</tr>
<tr>
 <td><input type="submit" value="register"></td>
 <td><input type="reset" value="clear"></td>
  </tr>
</table>
</form>
<a href="RegisterServlet?action=view">RegisterServlet</a>;
</body>
</html>