package com.statickeyword;

public class Employee  
{
	int empid;
	String name;
	String designation;
	double salary;
	
	static String company="TCS";//static variable
	static
	{
		company="american express";
		System.out.println("static method calling");
	}

	public Employee(int empid, String name, String designation, double salary)
	{
		
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", salary=" + salary	+"company=" +company+"]";
	}

	

		public static void main(String[] args) 
		{
			System.out.println("main method starts");
			 Employee e1=new Employee(1000,"Nishu","SWDEV",75000);
			 Employee e2=new Employee(1000,"aishu","SWDEV",75000);
			 Employee e3=new Employee(1000,"vishu","SWDEV",75000);
			  
			 System.out.println(e1);
			 System.out.println(e2);
			 System.out.println(e3);
			 System.out.println("main method ends");
			// TODO Auto-generated method stub

		}
	}

