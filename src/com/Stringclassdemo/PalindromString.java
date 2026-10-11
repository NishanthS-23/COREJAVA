package com.Stringclassdemo;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		String s="malayalam";
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		s=scn.next();
		String rs=reverse(s);
		if (s.equals(rs))
			System.out.println("its palindrom");
		else
			System.out.println("not pslindrom");
		// TODO Auto-generated method stub

	}

	private static String reverse(String s) {
		String revstr="";
		int len=s.length();//4
		for(int i=len-1;i>=0;i--)//3
		{
			revstr=revstr+s.charAt(i);
		}
		// TODO Auto-generated method stub
		return revstr;
	}

}
