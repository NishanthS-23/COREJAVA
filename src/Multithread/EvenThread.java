package Multithread;

public class EvenThread extends Thread{
	Printnumber p;
	
	
public EvenThread(Printnumber p)
    {
		this.p = p;
	}
@Override
public void run() 
{
	int minEven=2;
	while(minEven<=10) 
	{
		p.PrintEven(minEven);
		minEven+=2;
	}
}
}
