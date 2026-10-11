package com.Inheritance;
 
class A
{
	 void m1()
	 
	{
		System.out.println("m1 is in A");
	}
}
class B extends A
{
	 void m2()
	{
		System.out.println("m1 is in B");
	}
}
class C extends A
{
	 void m3()
	{
		System.out.println("m1 is in C");
	}
}
class D extends  A
{
	 void m4()
	{
		System.out.println("m1 is in D");
	}

}
public class HirachelInheritance {

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		 
	}

}



