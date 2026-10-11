package com.example.Arrays;

import java.util.Scanner;

public class Binarysearch {
	public static void main(String args[]) {
		int n;
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter the number");
			n=scn .nextInt();
			int a[]=new int[n];
			System.out.println("Enter the value one by one");
			for (int i=1;i<n;i++) {
				a[i]=scn.nextInt();
			}
		}
		
		System.out.println("Enter the number for binary search");
	}
	static int binarysearch (int a[],int left,int right,int x)
	{   while(left<=right) {
			int mid=(left+right)/2;
			if (a[mid]==x)
			{
			}
			else if(x<a[mid])
			{
				right=mid+1;
			}else {
				left=mid-1;
			}
		}
		
		return x;
		
		
	}
}