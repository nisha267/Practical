package Practical.com.Collection;

import java.util.LinkedList;

public class LinkedListmethod {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Misbah");
		ll.add("Abhishek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");
		System.out.println("List 1 elements:"+""+ll);
		//retrieves the 1st elements of the list
		System.out.println(ll.peek());//by default 1st element
		System.out.println(ll.peekFirst());//specific element
		System.out.println(ll.peekLast());//fetch last element
		//retrieve and remove the 1st element from the list
		System.out.println(ll.poll());//by default first element
		System.out.println(ll.pollFirst());//specific element
		System.out.println(ll.pollLast());//fetch last element
System.out.println(ll.pop());//retrieve 1st element
	}}
