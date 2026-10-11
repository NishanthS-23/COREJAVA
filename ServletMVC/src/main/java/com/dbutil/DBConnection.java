package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
private static Connection con=null;

public DBConnection() {
	// TODO Auto-generated constructor stub
}

public static Connection getConnection()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Nishanth2312");
	}catch (Exception e) {
		e.printStackTrace(); 
		// TODO: handle exception
	}
	return con;  
}

}
