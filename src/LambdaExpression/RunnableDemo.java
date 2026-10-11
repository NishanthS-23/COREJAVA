package LambdaExpression;

public class RunnableDemo 
{

public static void main(String[] args) {
	Runnable obj=()->
	{System.out.println("Run method executerd Using lambda execution");
	
	System.out.println("Entering");
			
};
	Thread t=new Thread(obj);
	t.start();
	
}
}
 