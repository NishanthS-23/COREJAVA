package exceptionDemo;

import java.util.Scanner;

public class ExceptionHandlingBlock {

	public static void main(String[] args) {
		
		int a,b;
		Scanner Scn=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=Scn.nextInt();
		System.out.println("enter the second number");
		b=Scn.nextInt();
		
			try {
				
				int c= a/b;
				System.out.println("result="+c);
				int x[]= {10,20,30};
				System.out.println(x[4]);
			}
			catch(ArithmeticException e)
			{
				System.out.println("insidde catch block");
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1.getMessage());
			}
			catch(NegativeArraySizeException e2)
			{
				System.out.println(e2.getMessage());
			}
			finally
			{
				System.out.println("finally block excecuted");
			}
	} 
 
}
