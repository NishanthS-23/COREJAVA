package com.Superkeyword;

public class A {
	int i=10;
	public A()
	{
		System.out.println("A class constructor");
	}
	void display()
	{
	System.out.println("A class display method");
	}

}
class B extends A
{
	int i=10;
	public B()
	{
		super(); // calling super class contructor And super()  must be a first line
		System.out.println("B class contructor");
	}
	void display()
	{
		super.display();
		System.out.println("superclass varialble i="+super.i);
		System.out.println("sub class i="+i);
		System.out.println("B class display method");
	}
}