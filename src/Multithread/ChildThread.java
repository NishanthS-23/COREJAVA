package Multithread;

public class ChildThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("childthread starts");
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("child thrad inturrupted");
			}
	} 
		System.out.println("end of chiled thread");
	}

}
