 package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Demo {

	public static void main(String[] args) 
	{
     ArrayList a1=new ArrayList();
     
     a1.add("java");
     a1.add("c");
     a1.add("php");
     a1.add(21);
     a1.add('s');
     System.out.println(a1);
     System.out.println(a1.size()); 
    // a1.clear();
     System.out.println(a1);
     System.out.println(a1.isEmpty());
     
     ArrayList a2=new ArrayList();
     System.out.println(a2);
     a2.addAll(a1);
     System.out.println(a1);
     System.out.println(a2);
     
     System.out.println(a1.contains("java"));
     System.out.println(a1.containsAll(a2));
     
     a1.remove("java");
     System.out.println(a1);
     a1.removeAll(a2);
     System.out.println(a1);
     
     System.out.println(a2.hashCode());
     
     System.out.println(a1.equals(a2));
     
     Object Myarr[]=a2.toArray();
     for(int i=0;i<Myarr.length;i++)
     {
    	 System.out.println(Myarr[i]);
     }
     System.out.println("Iterate the element using Iterator");
     Iterator iterator=a2.iterator();	
     while(iterator.hasNext())
     {
    	 System.out.println(iterator.next());
     }
     }

}
