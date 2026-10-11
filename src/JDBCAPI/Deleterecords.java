package JDBCAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Deleterecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empid;
		int count=0;
		Scanner scn=new Scanner(System.in);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Nishanth@2312");
		PreparedStatement ps=con.prepareStatement("DELETE FROM EMPOYEE WHERE EMPID=?");
		System.out.println("Enter the empid to delete:");
		empid=scn.nextInt();
		ps.setInt(1, empid);
		 count = ps.executeUpdate();
		 if (count!=0)
		 
			 System.out.println(count+"Record deleted..");
		 
		 else 
		 
			 System.out.println("Record not deleted");
		 ps.close();
		 con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
