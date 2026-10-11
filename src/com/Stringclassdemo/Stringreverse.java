package com.Stringclassdemo;

public class Stringreverse {

	public static void main(String[] args) {
		
		String s1="java";
		reverse(s1);
		// TODO Ato-generated method stub

	}
	public static void reverse (String s)
	{
		String revstr="";
		int len=s.length();//4
		for(int i=len-1;i>=0;i--)//3
		{
			revstr=revstr+s.charAt(i);
		}
		System.out.println(revstr);
	}

}
