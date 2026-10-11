package JDBCAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Nishanth@2312");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from costomers");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"/t"+rs.getString(3)+"/t"+rs.getString(4));
			}
			rs.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
