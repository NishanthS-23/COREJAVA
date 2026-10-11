package codingchallage2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Student {
	
	
	public static void main(String[] args) {
		TreeMap<String,Integer> m1=new TreeMap();
		m1.put("sabari", 10);
		m1.put("nish", 23);
		m1.put("tharun", 25);
		
		System.out.println("ordinary treemap"+m1);
		for(Integer key:m1.values())
		{
			System.out.println("key"+m1.get(key));
			
		}
		System.out.println("\nIterating using keySet():");
        for (String key : m1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + m1.get(key));
        }
		System.out.println(m1);
		
	/*static HashMap<String,Integer> map=new HashMap();
	public static void sortbykey() {
		TreeMap<String, Integer> sorted = new TreeMap<>(map);
		sorted.putAll(map);
		for (Map.Entry<String, Integer> entry : sorted.entrySet()) 
            System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue());      
	
		
		}
	public static void main(String[] args) {
	
		map.put("java", 23);
		map.put("python", 24);
		map.put("C++", 25);
		map.put("Android", 50);
		
		System.out.println(map);
		sortbykey();*/
		
	//	Write A Program To Sort HashMap by keys
		
		
		//Write a Java Program To Convert A HashSet To An ArrayList
		/*HashSet<String> h=new HashSet();
		h.add("Nishu");
		h.add("swa");
		h.add("suve");
		h.add("mads");
		System.out.println("Original hashset list"+h);
		
		ArrayList<String> a=new ArrayList<>(h);
		System.out.println(a);
		a.add("suvetha");
		System.out.println("Altered list"+a);*/
		
		
		
		//Write A Java Program To Test An ArrayList Is Empty Or Not
		/*ArrayList<String> s1=new ArrayList();
		if(s1.isEmpty())
		{
		  System.out.println(s1.isEmpty());    
		}else
			System.out.println("flase");*/
		
		
		
		// Write a Java Program To Insert An Element at The Specified Position At The LinkedList
		/*LinkedList<String> s=new LinkedList();
		
	s.add("Nishanth");
	s.add("sabari");
	s.add("tharun");
	
	System.out.println(s);
	
	s.addFirst("Surya");
	System.out.println(s);
	}*/
}
}