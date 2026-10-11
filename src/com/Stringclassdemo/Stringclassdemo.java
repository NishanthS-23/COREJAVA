package com.Stringclassdemo;

public class Stringclassdemo {

	public static void main(String[] args) {
		String s1="java";
		String s2="  javavaV ";
		System.out.println(s1.charAt(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.contains("v"));
		System.out.println(s1.startsWith("j"));
		System.out.println(s1.startsWith("v",2));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		byte b[]=s1.getBytes();
		for(int i=1;i<b.length;i++)
		System.out.println(b[i]);
		
		char c[]=new char[s1.length()];
		s1.getChars(1, s1.length(), c, 0);
		   for (int i=0;i<c.length;i++)
			   System.out.println(c[i]);
		   
		   System.out.println(s1.isEmpty());
		   System.out.println(s2.length());
		   
		  System.out.println( s1.replace('a', 'k'));
		  System.out.println(s1.substring(2));// TODO Auto-generated method stub
          System.out.println(s2.substring(2, 6));
          System.out.println(s2.toLowerCase());
          System.out.println(s1.toUpperCase());
          System.out.println(s1+s2.trim());
          System.out.println(s1.concat(s2));
	}
 
}
