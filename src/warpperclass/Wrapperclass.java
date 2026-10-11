package warpperclass;

public class Wrapperclass {

	public static void main(String[] args) {
 int a=10;// primitive type
		int b=20;
		
		 System.out.println("coversion of primitive to String");
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);
		System.out.println(s1+s2);
		
		System.out.println("conversion primitive type to wrapper class object");
		Integer obj1=new Integer(25);
		Integer obj2=new Integer(30);
		
		System.out.println(obj1+obj2);//primitive to wrapper class using constructor
		
		System.out.println("coverting wrapper class to primtive type");
		int x=obj1.intValue();
		int y=obj2.intValue();
		System.out.println(x-y);
		
		System.out.println("convering String into object using static value method");
		obj1=Integer.valueOf("123");
		obj2=Integer.valueOf("456");
		System.out.println(obj1*obj2);
		
		System.out.println("converting numeric number into primitive number");
		x=Integer.parseInt("33");
		y=Integer.parseInt("321");
		System.out.println(x/y);
		
	 Integer p=25;
	 int i=(int)p;
	 System.out.println(i);
		 
		
		// TODO Auto-generated method stub

	}

}
