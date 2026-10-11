package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//queue- Data structure(FIFO)  first in first out
		//peek()- retrieve the front element
		//poll()- remove the front position element
		//element()
		
		Queue <Integer>q1=new LinkedList<>();
		
		q1.add(25);// front or head
		q1.add(3);
		q1.add(7);
		q1.add(2);
		q1.add(8);
		
		q1.offer(36);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.element());
		
   Queue<Integer>q2=new PriorityQueue<>(); //priority algorithm
		
		q2.add(12);// front or head
		q2.add(3);
		q2.add(7);
		q2.add(2);
		q2.add(8);
		q2.offer(15);
		 System.out.println(q2);
		
	}

}
  