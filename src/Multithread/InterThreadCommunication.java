package Multithread;

public class InterThreadCommunication {

	public static void main(String[] args) 
	{
       Printnumber p=new Printnumber();
       OddThread t1=new OddThread(p);
       EvenThread t2=new EvenThread(p);
       
       t1.start();  
       t2.start();
       
	}

}
