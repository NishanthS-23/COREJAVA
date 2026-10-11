package com.Abstractclass;

public class Absractclass {

	public static void main(String[] args) {
		Animal a=new Dog(); // can upcast
		a.makesound();
		a.eating();
		
		Cat c=new Cat();   // can call by subclass also
		c.eating();
		c.makesound();
		
		// TODO Auto-generated method stub

	}

}
