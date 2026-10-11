package com.AGGREGATION;

public class Student {
	int rollno;
	String name;
	Address adr;
	
	
	public Student(int rollno, String name, Address adr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adr = adr;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", adr=" + adr + "]";
	}


	public static void main(String[] args) {
		Address adr=new Address("chennai","tamilnadu","India");
		Student s1=new Student(7,"nishu",adr);
		Student s2=new Student(8,"amudha",adr);
		Student s3=new Student(9,"Ajay",adr);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	
		// TODO Auto-generated method stub

	}

}
