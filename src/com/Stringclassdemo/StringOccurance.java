package com.Stringclassdemo;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the String");
		String x=s.next();
		
		String pi="";
		for (int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
			if(pi.indexOf(c)!=-1)
				continue;
			pi+=c;
			int k=getcount(x,c);
			System.out.println(c+"="+k);
				
		}

	}

	 static int getcount(String x, char c) {
		 String d=x.replace(c+"", "");
		return x.length()-d.length();
		
		// TODO Auto-generated method stub
		
	}

}
