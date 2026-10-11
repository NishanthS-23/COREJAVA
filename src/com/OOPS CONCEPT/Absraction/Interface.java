package com.Absraction;

import com.Absraction.Vehicle.Bike;

public class Interface {

	public static void main(String[] args) {
		Vehicle v;
		Bike obj1=new Bike();
		v=obj1;
		System.out.println("Displaying bicycle . . .");
		v.Speedup(6);
	    v.gearup(5);
	    v.handbrake(2);
	    
	    obj1.display();
		// TODO Auto-generated method stub

	}

}