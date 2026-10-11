package Collection;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		// Generics
		
		//Generics introduced in JDK 1.5
	/*rrayList a1=new ArrayList();
		a1.add("java");//non primitive
		a1.add("python");//non
		a1.add(new Integer(25));
		a1.add(true);
		a1.add(new Double(2.56));*/
		
		//JDK 1.5(Generics)
	/*rrayList<Object>a1=new ArrayList<Object>();
		a1.add("java");//non primitive
		a1.add("python");//non
		a1.add(25);//primitive
		a1.add(true);//primitive
		a1.add(2.56);
		System.out.println(a1);*/
		
		//JDK 1.7 Diamond Operator introduced
		ArrayList a1=new ArrayList();
		a1.add("java");//non primitive
		a1.add("python");//non
		a1.add(25);//primitive
		a1.add(true);//primitive
		a1.add(2.56);
		System.out.println(a1);
		
	}

}
