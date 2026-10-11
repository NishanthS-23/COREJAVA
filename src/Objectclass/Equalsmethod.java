package Objectclass;

public class Equalsmethod {

	public static void main(String[] args) {
		Book b1=new Book(100);
		Book b2=new Book(100);
		System.out.println(b1==b2);
		System.out.println(b1);
	    System.out.println(b2);
        System.out.println(b1.equals(b2));
	}

}
