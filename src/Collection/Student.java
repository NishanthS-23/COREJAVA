package Collection;

public class Student {
	
	String name;
	int marks;
	int age;
	public Student(String name, int marks, int age)
	{
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	@Override
	public int hashCode() 
	{
		// TODO Auto-generated method stub
		return age;
	}@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
		if(!(x instanceof Student))
			return false;
		else
		{
			Student s1=(Student)x;//douncasting
			return name.equals(s1.name)&&marks==s1.marks&&age==s1.age;
		}
	}
}
