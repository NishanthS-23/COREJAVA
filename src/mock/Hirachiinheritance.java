package mock;

 class A
{
  public void m1()
  {
	 
	  System.out.println("insing m1");
  }

}
 class B extends A
{
	public void m2()
	{
		m1();
		System.out.println("insind m2");
		
	}
}
 class c extends A
 {
	 public void m3()
	 {
		 m1();
		 System.out.println("inside m3");
	 }
 }


public class Hirachiinheritance {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		System.out.println("Hirachiinheritance");
		
		
	}

}
