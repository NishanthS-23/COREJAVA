package comparatorinterface;


public class Book implements Comparable<Object>
{
	String bookname;
	int pages;
	double prize;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookname, int pages, double prize) {
		super();
		this.bookname = bookname;
		this.pages = pages;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", pages=" + pages + ", prize=" + prize + "]";
	}

	@Override
	public int compareTo(Object x) {
		Book b1=(Book)x;
		
		return this.bookname.length()-b1.bookname.length();
	}
}