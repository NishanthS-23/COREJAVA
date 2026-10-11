package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		//set -interface
		//hashset
		//linkedhashset
		//treeset
		
		HashSet s1=new HashSet();// random order
		s1.add("java");
		System.out.println(  s1.hashCode());
		s1.add("python");
		System.out.println(  s1.hashCode());
		s1.add("PHP");
		s1.add("c language");
		s1.add("andriod");
		s1.add("java");
		
		System.out.println (s1);
		
		LinkedHashSet s2=new LinkedHashSet();//user defined set is displayed
		s2.add("java");
		s2.add("python");
		s2.add("PHP");
		s2.add("c language");
		s2.add("andriod");
		s2.add("java");
		
		System.out.println (s2);
		
		TreeSet s3=new TreeSet();// natural(or) assending order
		s3.add("java");
		s3.add("python");
		s3.add("PHP");
		s3.add("c language");
		s3.add("andriod");
		s3.add("java");
		
		System.out.println (s3);
		
		
		
	}

}
