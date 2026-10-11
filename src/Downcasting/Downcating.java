package Downcasting;

public class Downcating {

	public static void main(String[] args) {
		A a1=new B();  // upcasting
		a1.test1();
		
	  B b1=(B) a1;   // downcating
	   b1.test1();
	   
	   C c1=(C)a1;
	   c1.test3();
		// TODO Auto-generated method stub

	}

}
