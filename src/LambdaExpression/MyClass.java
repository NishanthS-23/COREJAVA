package LambdaExpression;

public class MyClass 
{

	public static void main(String[] args) 
	{
		 
		// MyInterface obj=( x, y)->{return (x+y);};
		MyClass obj1=new MyClass();
		MyInterface obj2=obj1::m1;
		//MyInterface obj2=MyClass::m2;
		
	    	//MyInterface obj2=MyClass::new; //
		 double result=obj2.add(2.8,10);//calling method
		 System.out.println("Result "+result);
	}
	double m1(double x,int y)
	{
		return(x+y);
	}
	static double m2(double x,int y)
	{
		return(x+y);
		
	}
}
   //FunctionalInterface
   //runnable   -run()
   //comparable -compareTo()
   //comparator -compare()