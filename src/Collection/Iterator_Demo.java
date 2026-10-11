package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("java");
		a1.add("PHP");
		a1.add("python");
		System.out.println(a1);
		Iterator itr=a1.iterator();
		itr.next();
		itr.remove();
		System.out.println(a1);
		/*for (int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}*/
		
		}
}
