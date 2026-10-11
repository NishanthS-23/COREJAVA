package com.Abstractclass;

public abstract class Animal {
  abstract void makesound();// abstract method
  abstract void eating();
  
  void moving() {
	  System.out.println("Animal is moving");// can also have concrete method
}

}
class Dog extends Animal
{

	@Override
	void makesound() {
		System.out.println("Dog barks");
		// TODO Auto-generated method stub
		
	}

	@Override
	void eating() {
		System.out.println("Dog eats pedigree");
		// TODO Auto-generated method stub
		
	}
	
}
class Cat extends Animal
{

	@Override
	void makesound() {
		System.out.println("cat make meowww");
		// TODO Auto-generated method stub
		
	}

	@Override
	void eating() {
		System.out.println("cat eats fish");
		// TODO Auto-generated method stub
		
	}
	
}
