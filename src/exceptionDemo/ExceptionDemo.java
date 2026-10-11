package exceptionDemo;

import java.io.DataInputStream;
import java.io.IOException;

import com.Superkeyword.A;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java");
		int a,b;
		DataInputStream dis= new DataInputStream(System.in);
		a=Integer.parseInt(dis.readLine());
		b=Integer.parseInt(dis.readLine());
		System.out.println(a);
		System.out.println(b);
		System.out.println(a/b);   
		
		m1();
	
	}
	static void m1() {
		
		System.out.println("m1 in m1");
		
	}

}
