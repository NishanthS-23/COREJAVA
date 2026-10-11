package Multithread;

public class MainThread2 {

	public static void main(String[] args) {

		System.out.println("main thread starts");
		
		Thread t=new Childthread2();
		t.start();
		for (int i=1;i<=5;i++)
		{
			
			System.out.println("Main thread :" +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Main thread inturrpted");
			}
		}
		System.out.println("main thread ends");
		}
		
	
}
