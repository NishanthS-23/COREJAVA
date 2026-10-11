package Objectclass;

public class Book {
	int pages;
	public Book(int p) {
		pages=p;
		// TODO Auto-generated constructor stub
	}
@Override
public boolean equals(Object x) {
	  if(!(x instanceof Book))
	return false;
	  return pages==((Book)x).pages; // downcasting
}
}
