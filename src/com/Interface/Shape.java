package com.Interface;

public interface Shape {
	public static final double pi = 3.14;
	void calculate_area();	
}
 class Circle implements Shape
 {
   double radius;
  
	public Circle(double radius2) {
	   {
		   this.radius=radius;
	   }
	// TODO Auto-generated constructor stub
}
	@Override
	public void calculate_area() {
		System.out.println("Area of circle is "+(pi*radius*radius));
		// TODO Auto-generated method stub
		}
 }
 class Square implements Shape
 {
	 double a;
	 public Square(double a)
	 {
		 this.a=a;
	 }

	@Override
	public void calculate_area() {
		System.out.println("Area of Square is="+(a*a));
		// TODO Auto-generated method stub
		
	}
	 
 }
 class Triangle implements Shape
 {
  double l,b;
  public  Triangle(double l,double b)
  {
	  this.b=b;
	  this.l=l;
  }
	@Override
	public void calculate_area() {
		System.out.println("Area of Triangle is "+(l+b));
		// TODO Auto-generated method stub
		
	}
	 
 }