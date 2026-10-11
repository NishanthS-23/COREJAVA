package com.Method;

public class Animal {

	public static void main(String[] args) {
		Animal a = new Animal();
		int x=a.move("Elephant");
		System.out.println(x);
		a.eatingfood();
		a.makesound("Lucky", 5);
		
		
		
		// TODO Auto-generated method stub

	}
  int  move(String name) //name local variable
 {
	 System.out.println(name+  "Animal moving");
	 return 10;
 }
 String makesound(String name,int count)
 {
	 System.out.println("Making sound  "+count);
	 return ("lion");
 } 
 void eatingfood()
 {
	 System.out.println("Eating food");
 }
}
