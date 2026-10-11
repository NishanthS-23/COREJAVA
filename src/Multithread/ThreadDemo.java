package Multithread;

public class ThreadDemo implements Runnable {
	Thread t;
	String Threadname;
	ThreadDemo(String name, int priority)
	{
		Threadname=name;
		t=new Thread(Threadname);
		t.setName(Threadname);
		t.setPriority(priority);
		
	}
	@Override
	public void run() 
	{
	System.out.println(Thread.currentThread().getName()+"starts");
	System.out.println(Thread.currentThread().getName()+" priority"+t.getPriority());
	for (int i=1;i<=5;i++)
	{
		System.out.println(Thread.currentThread().getName()+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println(Thread.currentThread().getName()+"ends");
	}

	}


