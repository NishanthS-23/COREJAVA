package pack2.pack3;

import pack1.A;
import pack1.B;

public class C {
	public int c=3;
	public int get_c()
	{
		return c; 
	} 
	public void m2()
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.get_a());
	
	
	B obj2=new B();
	System.out.println(obj2.b);
	System.out.println(obj2.get_b());
	
	
	}

}
