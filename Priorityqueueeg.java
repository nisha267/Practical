package Practical.com.Collection;

import java.util.PriorityQueue;

public class Priorityqueueeg {
public static void main(String[] args) {
	PriorityQueue<String>queue=new PriorityQueue<String>();
	queue.add("Prakash");
	queue.add("Babai");
	queue.add("Sankhajit");
	queue.add("Hasan");
	queue.add("Bumba");
	queue.add("Owashim");
	queue.add("Tanmoy");
	System.out.println("Head:"+queue.element());
	System.out.println("Queue:"+queue);
	System.out.println("Head:"+queue.peek());
	System.out.println("Queue:"+queue);
	System.out.println("Iterating the elements");
	System.out.println("Head:"+queue.poll());
	System.out.println("Queue:"+queue);
	System.out.println("Head:"+queue.remove());
	System.out.println("Head:"+queue);
}
}
