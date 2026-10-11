package comparatorinterface;

import java.util.Comparator;

public class PageComparator implements Comparator<Book> {

 

	 @Override
	 public int compare(Book x, Book y) {
		// TODO Auto-generated method stub
		return x.pages-y.pages;
	 }

}
