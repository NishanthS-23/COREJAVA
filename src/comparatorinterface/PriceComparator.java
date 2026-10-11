package comparatorinterface;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book x, Book y) {
		// TODO Auto-generated method stub
		if( x.prize>y.prize)
			return 1;
		else if (x.prize==y.prize)
		 return 0;
		else 
			return-1;
	}



}
