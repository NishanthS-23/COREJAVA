package Functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example {

	public static void main(String[] args) {
		Employee e1=new Employee(007,"Nishu","SW devops",75000.00);
		Employee e2=new Employee(006,"Aish","SW engineer",35000.00);
		Employee e3=new Employee(005,"vish","web engineer",73000.00);
		Employee e4=new Employee(004,"sabs","SW devops",79000.00);
		
		List<Employee>emplist=new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		/*for (int i=0;i<emplist.size();i++)
		{
			System.out.println(emplist.get(i));
		}*/
	/*	emplist.forEach(new Consumer<Employee>()
		{

			@Override
			public void accept(Employee e) {
				System.out.println(e);
				// TODO Auto-generated method stub
			}
			});*/
		//emplist.forEach((e)->System.out.println(e));
	     //emplist.forEach(System.out::println);
		
		//emplist.stream().filter(e->e.designation.contains("engineer")).forEach(System.out::println);
		//emplist.stream().filter(e->e.salary>=50000).forEach(System.out::println);
		emplist.stream().map(e->e.Empname.toUpperCase()).forEach(System.out::println);
		emplist.stream().map(e->e.Empname.length()).forEach(e->System.out.println(e));
		
	}
	
}
			
		
	


