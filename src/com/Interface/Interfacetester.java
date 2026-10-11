package com.Interface;

public class Interfacetester {

	public static void main(String[] args) {
		Shape s=new Circle(2.00);
		s.calculate_area();
		s=new Square(4);
		s.calculate_area();

	}

}
