package model;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int empid;
	private String empname;
	private int age;
public Employee() {
	// TODO Auto-generated constructor stub
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
