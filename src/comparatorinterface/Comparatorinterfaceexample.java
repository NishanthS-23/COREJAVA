package comparatorinterface;

import java.util.Arrays;
import java.util.Scanner;

public class Comparatorinterfaceexample {

	public static void main(String[] args) {
		Book []myBook= {new Book("java",400,205.0),
			            new Book("php",358,125.0),
		                new Book ("Android",700,560.0), 
		                new Book("sql",360,175.0)
		                };
				        Scanner s=new Scanner(System.in);
				        System.out.println("Sorting based on...");
				        String input=s.next();
				        
				        if(input.equalsIgnoreCase("name"))
				        {
	                    	Arrays.sort(myBook); //comparable
				        }
				        if(input.equalsIgnoreCase("page"))
				        {
				        	Arrays.sort(myBook,new PageComparator());
				        }
				        if(input.equalsIgnoreCase("price"))
				        		{
				        	Arrays.sort(myBook,new PriceComparator());
				        		}
		for(int i=0;i<myBook.length;i++)
		  System.out.println(myBook[i]);
		
	 

		 
	}


}
