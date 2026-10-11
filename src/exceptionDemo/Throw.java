package exceptionDemo;

import java.io.IOException;

public class Throw {

	public static void main(String[] args) {
		try
		{
		m1();
		}
		catch(IOException e)
		{
			System.out.println("inside cach block");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
	}  
	 static void m1() throws IOException ,ArithmeticException// it throws class
	 {
		throw new IOException("IOException passed Here"); //throw
		
	}
   
}
