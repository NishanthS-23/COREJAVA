package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		        //Iterator
				/*
				 * public boolean hasnext()
				 * public object next()
				 * Public void remove()
				 * 
				// ListIterator
				 *public boolean hasnext()
				 *public object next()
				 *public void remove()
				 *
				 *public boolean has previous()
				 *public objet previous()
				 *
				 *public void add(obj element)
				 *public void set(obj element)
				 *
				 *public int nextIndex()
				 *pblic int previousIndex()
				 *
				 */
			       List<Integer> a1=new ArrayList<Integer>();// upcasting
			       a1.add(25);
			       a1.add(3);
			       a1.add(56);
			       a1.add(97);
			       
			       System.out.println(a1);
			       
			       ListIterator <Integer>itr=a1.listIterator();
			      itr.add(100);
			      itr.add(200);
			      System.out.println(a1);
			     
			    
			      
			      itr.next(); 
			      itr.set(300);
			      System.out.println(itr.nextIndex());
			      itr.previous();
			      System.out.println(itr.previousIndex());
			  
		// TODO Auto-generated method stub

	}

}
