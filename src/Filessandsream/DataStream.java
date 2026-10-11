package Filessandsream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
	int a;
	float b;
	double d;
	char c;
	boolean e;
	try {
		FileOutputStream f=new FileOutputStream("E:/javaprogram/sample.txt");
		DataInputStream dis=new DataInputStream(System.in);
		DataOutputStream dout=new DataOutputStream(f);
		System.out.println("Enter the Integer:");
			a=Integer.parseInt(dis.readLine());      
			System.out.println("Enter the float:");	
			b=Float.parseFloat(dis.readLine());  
			System.out.println("Enter the Char:");
			c=dis.readLine().charAt(0);
			System.out.println("Enter the double:");
			d=Double.parseDouble(dis.readLine());
			System.out.println("Enter the boolean:");
			e=Boolean.parseBoolean(dis.readLine());  
			
			dout.writeInt(a);
			dout.writeFloat(b);
			dout.writeChar(c);
			dout.writeDouble(d);
			dout.writeBoolean(e);
		FileInputStream f2=new FileInputStream("E:/javaprogram/sample.txt");
		DataInputStream dis2=new DataInputStream(f2);
		
		
		
		}
	catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	  }

	}
}
	

