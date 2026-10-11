package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//map interface
		//collection of key and value pairs
	/*	Map<String,Integer>m1=new HashMap<>(); // random order
		m1.put("java", 25);
		m1.put("python", 56);
		m1.put("php", 86);
		m1.put("asp", 21);
		
		System.out.println(m1);*/
		
		Map<String,Integer>m2=new LinkedHashMap<>(); // Insertion order
		m2.put("java", 25);
		m2.put("python", 56);
		m2.put("php", 86);
		m2.put("asp", 21);
		
		System.out.println(m2);
		
		Set<String>set=m2.keySet();
		System.out.println(set);
		
		Iterator<String> itr=m2.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
      Iterator<Integer> itr2=m2.values().iterator();
      while(itr2.hasNext());
      {
    	  System.out.println(itr2.next());
      }
      int a[]= {10,20,30};
      for (int x:a)
      {
    	  System.out.println(x);
      }
      for (Map.Entry<String,Integer> m: m2.entrySet())
      {
    	  System.out.println(m.getKey()+"="+m.getValue());
    	  
      }
		/*Map<String,Integer>m3=new TreeMap<>(); // Asending order   
		m3.put("java", 25);
		m3.put("python", 56);
		m3.put("php", 86);
		m3.put("asp", 21);
		
		System.out.println(m3);*/
		
		
	}

}
