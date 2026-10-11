package JDBCAPI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertRecord {
	public static void main(String[] args) {
		int empid;
		String empname;
		String strDate;
		java.util.Date doj = null;
		java.sql.Date sqldoj;
		int count=0;
		Scanner scn=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "Nishanth@2312");
			PreparedStatement ps=con.prepareStatement("INSERT EMPLOEE (EMPID,EMPNAME,DOJ)"+"VALUES (?,?,?");
			System.out.println("Ener the employee ID ");
			empid = scn.nextInt();
			System.out.println("Enter the emp name ");
			empname =scn.next();
			System.out.println("Enter the Date of Joining");
			strDate=scn.next();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
			dateFormat.parse(strDate);
			sqldoj=new java.sql.Date(doj.getTime());
			
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setDate(3, sqldoj);
			
			
			count =ps.executeUpdate();
			if (count!=0)
			{
				System.out.println(count+" Record updated");
			}
			else
			{
				System.out.println("Record updation failed");
			}
			con.close();
			
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
