package Multithread;

public class Printnumber 
{
	boolean flag=false;
	public synchronized void printOdd (int number)
	{ 
		while(flag)
		{ 
			try
			{
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("Odd "+number);
		 flag=true;
		 notify();
		 
	}
	public synchronized void PrintEven(int number)
	{
		while(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Even "+number);
		flag=false;
		notify();

	}
	
}
