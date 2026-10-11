package Functional_programming;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier{

	public static void main(String[] args)
	{
		Supplier<String> msg=new SupplierDemo();
		System.out.println("message="+msg.get());

	}

	@Override
	public String get() {
		
		return "wellcome";
	}

}
