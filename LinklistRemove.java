package Practical.com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistRemove {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Misbah");
		ll.add("Abhishek");
		ll.add("Atif");
		ll.add("Niladri");
		ll.add("Soumya");
		ll.add("Sourav");
		System.out.println("List 1 elements:"+""+ll);
		LinkedList<String>ll2=new LinkedList<String>();
		ll2.add("Peso");
		ll2.add("Shifa");
		ll2.add("Elijah");
		System.out.println("List 2 elements:"+""+ll2);
		ll.addAll(ll2);
		//Removing specific element on the basis of particular position
		ll.remove("Niladri");
		System.out.println("After removing:"+""+ll);
		//removing specific element on the basis of particular position
		ll.remove(1);
		System.out.println("After removing from specific position"+""+ll);
		//removing all the new elements of list 2
		ll.removeAll(ll2);
		System.err.println("After removing all new elements"+""+ll);
		//remove 1st element from the list
		ll.removeFirst();
		System.out.println("After removing 1st element"+""+ll);
		//remove last element from the list
		ll.removeLast();
		System.err.println("After removing last elements"+""+ll);
		//adding new elements to the list 1
		ll.add("Pallabi");
		ll.add("Anudip");
		ll.add("Java");
		ll.add("Pallabi");
		ll.add("Collection");
		System.out.println("Updated list elements:"+""+ll);
		//remove first occurrence of element
		ll.removeFirstOccurrence("Pallabi");
		System.out.println("Removing 1st occurance"+""+ll);
		////remove last occurrence of element
		ll.removeLastOccurrence("Pallabi");
		System.out.println("Removing last occurance"+""+ll);
		Iterator i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());}
		ll.clear();
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}
		}}
		
		

