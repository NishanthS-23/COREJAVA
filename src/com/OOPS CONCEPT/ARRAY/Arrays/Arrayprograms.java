package com.example.Arrays;

import java.util.Scanner;

public class Arrayprograms {

	public static void main(String[] args) {
		 int n;
		 Scanner scn=new Scanner(System.in);
		 System.out.println("Enter the number");
		 n=scn.nextInt();
		 int a[]=new int[n];
		 System.out.println("Enter the value  one by one");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=scn.nextInt();
		 }
		//for sorting
		 int count=0;
		 for (int i=0;i<a.length;i++)
		 {
			 for (int j=i+1;j<a.length;j++)
			 {
				 if (a[i]>a[j])	 
				 {
			 int temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 count++;
			 
		 }
			
	}
			 	 
} 
	  System.out.print("array values ");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(a[i]);
	  }
		System.out.println("the time complexity of sorting array is "+count);
	}
	
}


