package com.Method;

public class Dog {
	String name="lucky";
	int price=10000;
	String breed="stray dog";
	
	void barking()
	{
		System.out.println("Dog is barking");
		System.out.println("Dog name" + name);
		System.out.println("dog price" + price);
	}
	void eating()
	{
		System.out.println("Doi is eating");
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.barking();
		d.eating();
		// TODO Auto-generated method stub

	}

}
