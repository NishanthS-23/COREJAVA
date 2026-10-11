package Downcasting;

public class A {
	void test1()
	{
		System.out.println("test1 in A");
	}
}
class B extends A
{
	void test1()
	{
		System.out.println("test1 in B");
	}
}
class C extends A
{
	void test3()
	{
		System.out.println("test3 in c");
	}
}