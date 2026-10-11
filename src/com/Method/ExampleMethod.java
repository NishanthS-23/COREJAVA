package com.Method;

public class ExampleMethod {

	public static void main(String[] args) {
		m2();
		
		// TODO Auto-generated method stub

	}
   static void m1()
  {
	  
	  System.out.println("Executing m1");
}
  
  static void m2()  
  {
	  new ExampleMethod().m1();// referance for non static method
	  System.out.println("Executing m2");
  }
	  static void m3() {
		  System.out.println("Executing m3");

  }
}
