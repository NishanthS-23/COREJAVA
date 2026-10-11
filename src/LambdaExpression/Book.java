package LambdaExpression;

import java.util.Comparator;

public class Book implements Comparator<Book>
{
	String name;
	int page;
	double price;
	
	public Book(String name, int page, double price) {
		super();
		this.name = name;
		this.page = page;
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return "Book [name=" + name + ", page=" + page + ", price=" + price + "]";
	}
/*	@Override
	public int compareTo(Object x)
	{
		Book b=(Book)x;
		if (name.length()==b.name.length())
			return 0;
		else if (name.length()>b.name.length())
			return 1;
		else
			return -1;
		
	}
	*/
	@Override
	public int compare(Book b1, Book b2) {
			
			if (b1.name.length()==b2.name.length())
				return 0;
			else if (b1.name.length()>b2.name.length())
				return 1;
			else
				return -1;
		};
			
	}


