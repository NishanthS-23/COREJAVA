package exceptionDemo;

public class FinalFinallyFinalize {

	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			int a=10/2;
			int b []= {10,20,30};
			 
			System.out.println("no exception output");
		}
		catch(ArithmeticException e)
		{
			System.out.println("inside catch block");
		}
			
		catch (NegativeArraySizeException e2) {
			System.out.println("inside OOBE");
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		//clean up processing
		//closing database,network connection
		//closing files
	}

}
