package com.example.Arrays;

import java.util.Scanner;

public class Arrayselectionsorting {

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
			 // for linear search 
			 int find_element;
			 int findindex = 0;
			 boolean flag=false;
			 System.out.println("Enter the number for linear search ");
			 find_element=scn.nextInt();
			 for(int i1=0;i1<a.length;i1++)
			 {
				 if (a[i1]==find_element)
				 {
					 flag=true;
					 findindex=i1;
					 break;
				 }
					 
			 }
			 if(flag)
			 System.out.println("found Index number"+findindex);
			 else 
				 System.out.println("Not found ");
				 
			 }
		 {
			 	 
} // for selection sorting
		 int count1=0;
		 for(int i=0;i<a.length;i++) {
			 int index=i;
			 for(int j=i+1;j<a.length;j++) {
				 if(a[j]<a[index]) {
					 index = j;
				 }
			 }
			 int small=a[index];
			 a[index]=a[i];
			 a[i]=small;
			 count1++;
		 }
		 
		 
		  
		 
	  System.out.print("array values of selection sort is  ");
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(a[i]);
	  }
		System.out.println("the time complexity of sorting array is "+count);
	}
	
}

