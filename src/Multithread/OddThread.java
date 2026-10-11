package Multithread;

public class OddThread extends Thread
{
	Printnumber p;
	
  public OddThread(Printnumber p) {
		
		this.p = p;
	}

  @Override
public void run()
  {
	  int minOdd=1;
	  while(minOdd<+10)
	  {
		  p.printOdd(minOdd);
		  minOdd+=2;
	  }
	
}
}
