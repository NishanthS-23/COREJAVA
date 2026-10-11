package Functional_programming;

public class Employee {
	int id;
	String Empname;
	String designation;
	double salary;
	
	public Employee(int id, String empname, String designation, double salary) {
		super();
		this.id = id;
		Empname = empname;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Empname=" + Empname + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
	

}
