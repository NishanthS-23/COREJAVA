package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dbutil.DBConnection;
import com.model.Student2;
import com.mysql.cj.xdevapi.Statement;

public class StudentDAO {
	java.sql.Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
    Connection dbcon;
    int count=0;
    public StudentDAO() 
    {
		dbcon=DBConnection.getConnection();
	}
    
    /*insert operation*/
    public int addStudent  (Student2 s)
    {
    	try
    	{
    	 ps=dbcon.prepareStatement("INSERT INTO STUDENT2 (REGNO,STUDENT_NAME,AGE,GENDER,DEPT)VALUES(?,?,?,?,?)");	
    	
    		  ps.setInt(1, s.getRegno());
    		  ps.setString(2, s.getStudent_name() );
    		  ps.setInt(3, s.getAge());
    		  ps.setString(4, s.getGender());
    		  ps.setString(5, s.getDept());
    		  
    		 count= ps.executeUpdate();  
    		 
    	}
    	catch (Exception e)
    	{
	
    }
		return count;
		
    }
 public  ArrayList getAllStudent() {
	return null;
}
 {
	 ArrayList<Student2> allStudentList=new ArrayList<>();
	 try {
		 	stmt=dbcon.createStatement();
		 	rs=stmt.executeQuery("SELECT * FROM STUDENT2");
		 	while(rs.next()) {
		 		Student2 s=new Student2();
		 		s.getRegno();
		 		
		 	}
	 }
	 catch (Exception e) {
		// TODO: handle exception
	}
 }
}
