package Practical.com.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequedemo {
public static void main(String[] args) {
	Deque<String>deque=new ArrayDeque<String>();
	deque.add("Pallabi");
	deque.add("Subhrajit");
	deque.add("Mamta");
	deque.add("Monami");
	deque.offerFirst("Anju");
	System.out.println("After offer first");
	deque.offerFirst("Monalisa");
	System.out.println("After offer last");
	//traversing
	for(String str:deque) {
		System.out.println(str);
		//deque.peek() & deque.peekFirst same as peek()
	}System.out.println("Peek:"+deque.peekLast());
	System.out.println("After peek last");
	for(String str1:deque) {
		System.out.println(str1);
	}////deque.poll() & deque.pollFirst same as poll()
	System.out.println("Peek:"+deque.pollLast());
	System.out.println("After poll last");
	for(String str:deque) {
		System.out.println(str);
	
}
}}
