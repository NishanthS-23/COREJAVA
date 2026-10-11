package com.example;

public class Findminimum {

	public static void main(String[] args) {
		int a[]= {10,30,40,2,8,99,66};
		findMin (a);  // passing an array to another method
	}
	static void findMin(int x[]) {
		int min=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(min>x[i])
			{
				min=x[i];
			}
			System.out.println("minimum number is "+ min);
		}
		// TODO Auto-generated method stub

	}

}
