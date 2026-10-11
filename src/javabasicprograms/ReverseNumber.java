package javabasicprograms;

import java.util.Scanner;
class Rectangle
 {
  public static void main(String args[])
  {
   int rows; 
   Scanner s=new Scanner(System.in);
   System.out.println("How many rows");
    rows =s.nextInt();
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=rows;j++)
    {
     if(i==1||i==rows||j==1||j==rows)
     System.out.print("*");
     else  
     System.out.print(" ");
     }
    System.out.println();
   }
 }
}
/*import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		int answer = 0;
		System.out.println("Enter the number for reversing");
		number=s.nextInt();
		while(number!=0)
		{
			int lastdigit=number%10;
		    answer=answer*10+lastdigit;
		    number=number/10;
		    System.out.println("reversed number is"+number);
		}
		
	}

}*/
