package Multithread;

public class MultiThreadDemo {

	public static void main(String[] args)
	{ 
		
		try {
	//int priority=Thread.MAX_PRIORITY;//10 and Min priority and norm priority
	//System.out.println("Priority ="+priority);
			ThreadDemo obj1=new ThreadDemo("Thread-1" ,Thread.MAX_PRIORITY);
			ThreadDemo obj2=new ThreadDemo("Thread-2",Thread.MIN_PRIORITY);
			ThreadDemo obj3=new ThreadDemo("Thread-3",Thread.NORM_PRIORITY);
			// TODO Auto-generated method stub
			Thread t1=new Thread(obj1);
			t1.start();
			t1.stop();
			Thread t2=new Thread(obj2);
			t2.start();
			Thread t3=new Thread(obj3);
			t3.start();
			
			System.out.println(Thread.currentThread().getName()+"starts");
			System.out.println(t1.isAlive());
			System.out.println(t2.isAlive());
			System.out.println(t3.isAlive());
			for(int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+i);
				Thread.sleep(1000);
			}
			t2.join();// wait for thread to terminate
			t3.join();
			System.out.println(t2.isAlive());
			System.out.println(t3.isAlive());
			
			
		System.out.println(Thread.currentThread().getName()+"Ends");
		
	}catch(InterruptedException e)
		{
    	e.printStackTrace();
		}
    
}
}
