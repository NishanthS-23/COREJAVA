package Collection;

import java.util.HashSet;
import java.util.Set;

public class Student_tester {

	public static void main(String[] args)
	{
		Student s1=new Student("Arun",70,25);
		Student s2=new Student("nishanth",100,24);
		Student s3= new Student("nishanth",100,24);

		Set s=new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		System.out.println(s);
	}

}
