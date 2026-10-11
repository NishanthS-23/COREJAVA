package Filessandsream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayoutputstreamexample {

	public static void main(String[] args) {
		String s="i am a java devops";
		
		byte b[]=s.getBytes();
		
		ByteArrayOutputStream output=new ByteArrayOutputStream();
	   try {
		output.write(b);
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
	   ByteArrayInputStream input=new ByteArrayInputStream(b);
	  
	  //public int available();
	   //public void skip(long 1);
	   
	   System.out.println("available bytes="+input.available());
	   input.read();
	   input.read();
	   System.out.println("available bytes="+input.available());
	   
	   int x;
		 while((x=input.read())!=-1)
		 {
			 input.skip(2);
			 System.out.print((char)x);
		 }
	}

}