package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static <E> void main(String[] args) {
		List a1=new ArrayList();// Upcasting
		
	//Public void add(int index,object element)
		//Public Object set (int index,Object element)
     //Public Object remove(int index)		
		//Public boolean remove(Object element)
		//Public Object get(int index)
		a1.add("java");
		a1.add("sql");
		a1.add("PHP");
		a1.add("python");
		
		a1.add(1, "c language");
		a1.add("java");
		
		System.out.println(a1);
		a1.set(3, "Nishu");
		System.out.println(a1);
		a1.remove(2);
		a1.remove("Nishu");
		System.out.println(a1);
		
		System.out.println(a1.get(2));
		System.out.println();
        System.out.println(a1.indexOf("java"));
        System.out.println(a1.lastIndexOf("java"));
        System.out.println(a1.subList(1, 3));
        
        Iterator <E> itr=a1.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());
          ListIterator litr=a1.listIterator();
          while(litr.hasPrevious())
          {
        	  System.err.println(litr.previous());
          }
        }
        		}

}
