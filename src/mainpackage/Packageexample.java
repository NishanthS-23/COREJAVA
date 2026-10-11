package mainpackage;

import pack1.A;
import pack1.B;
import pack2.pack3.C;

public class Packageexample {

	public static void main(String[] args) {
		A obj1=new A();
		System.out.println(obj1.a);
		System.out.println(obj1.get_a());
		// TODO Auto-generated method stub
		B obj2=new B();
		System.out.println(obj2.b);
		System.out.println(obj2.get_b());
		
		C obj3=new C();
		obj3.get_c();
		System.out.println(obj3.c);
		
		
	 int sum =obj1.get_a()+obj2.get_b();
	   System.out.println("sum="+sum);
	}

}
