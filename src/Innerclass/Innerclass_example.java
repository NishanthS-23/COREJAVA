package Innerclass;
class A
{
	private static int i;

	public A(int i) {
		super();
		this.i = i;
	}
	//inner class
	static class B 
	{
		public void display()
		{
			System.out.println(i);
		}
	}
	
}
public class Innerclass_example {

	public static void main(String[] args) 
	{
        A a1=new A(25);
       //A.B  b1=a1.new B();//inner class (or) non static way
       A.B b1=new A.B();//static way
        b1.display();
	}

}
