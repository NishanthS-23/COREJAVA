package comarableinterface;

import java.util.Arrays;

public class ComparableinterfaceExample 
{

	public static void main(String[] args) {
		//String arr[]= {"java","android","sql","c"};
  Book mybook[]= {new Book("java",400),
		         new Book("android",250),
		         new Book("Sql",120),
		         new Book("c",300)
                    };
		
		
  
		Arrays.sort(mybook);
		
		for(Book s:mybook)
		System.out.println(s);
		// TODO Auto-generated method stub

	}

	
	}


