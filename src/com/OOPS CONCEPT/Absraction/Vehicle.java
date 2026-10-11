package com.Absraction;

public interface Vehicle {
	public void gearup(int g);
	public void Speedup(int s);
	public void handbrake(int b);
 
class Bicycle implements Vehicle
{
  int gear;
  int speed =10;
  int brake;
	@Override
	public void gearup(int g) {
		gear=g;
		speed=speed+4;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Speedup(int s) {
		speed=s;	// TODO Auto-generated method stub
	}

	@Override
	public void handbrake(int b) {
		brake=b;
		speed=speed-2;// TODO Auto-generated method stub	
	}
	public void display()
	{
		System.out.println("speed ="+speed+"gear="+gear);
	}
	
}
class Bike implements Vehicle
{
 int gear;
 int speed;
 int brake;
	@Override
	public void gearup(int g) {
		gear=g;
		speed=speed+8;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Speedup(int s) {
		speed=s;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handbrake(int b) {
		brake=b;
		speed=speed-4;
		// TODO Auto-generated method stub
		
	}
	 void display ()
	 {
		 System.out.println("speed ="+speed +"gear ="+gear);
	 }
}
}
