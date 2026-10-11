package LambdaExpression;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		Book b1=new Book("java",150,225.0);
		Book b2=new Book("phython",155,225.0);
		Book b3=new Book("Sql",125,460.0);
		Book b4=new Book("Android",350,450.0);
		
		Book myBook[]= {b1,b2,b3,b4};
		Arrays.sort(myBook);
		for (int i=0;i<myBook.length;i++)
		{
			System.out.println(myBook[i]);
		}
	}

}
