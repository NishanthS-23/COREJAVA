package com.model;

import java.io.Serializable;

public class Student2 implements Serializable
{
	private int regno;
	private String student_name;
	private int age;
	private String gender;
	private String dept;
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
/*rules
 * class must be implement serialization interface
 * fields must be private
 * must have default constructor 
 * must have getter/setter methods
 */
}
