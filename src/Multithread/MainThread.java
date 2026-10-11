package Multithread;

public class MainThread {

	public static void main(String[] args) {
		
		System.out.println("main thread starts");
		Runnable obj=new ChildThread();
		Thread t=new Thread(obj);
		t.start();
		for (int i=1;i<=5;i++)
		{
			
			System.out.println("Main thread :" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Main thread inturrpted");
			}
		}
		System.out.println("main thread ends");
		}

}// contrxt switch : thread switch from one to another 
