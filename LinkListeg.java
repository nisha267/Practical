package Practical.com.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListeg {
public static void main(String[] args) {
	LinkedList<String>ll=new LinkedList<String>();
	ll.add("Misbah");
	ll.add("Abhishek");
	ll.add("Atif");
	ll.add("Niladri");
	ll.add("Soumya");
	ll.add("Sourav");
	System.out.println(ll);
	Iterator<String>itr=ll.iterator();
	while(itr.hasNext())
		System.out.print(" "+itr.next()+" ");	
	//adding an element at the specific position
	ll.add(2,"Nisha");
	System.out.println();
	System.err.println("After adding :"+""+ll);
	LinkedList<String>ll2=new LinkedList<String>();
	ll2.add("Peso");
	ll2.add("Shifa");
	ll2.add("Elijah");
	System.out.println("List 2 elements:"+""+ll2);
	//adding all second list elements to the first list
	ll.addAll(ll2);
	System.err.println("After adding  all elements of list 2 :"+""+ll);
	//adding all 2nd list elements to the 1st list at a specific position
	ll.addAll(2,ll2);
	System.out.println("After adding all elements of list 2 at specific position");
	ll2.addFirst("Pallabi");
	System.out.println("Add element at 1st:"+""+ll2);
	//adding element at the last position
	ll2.addLast("Subhajit");
	System.out.println("Add elements at last:"+""+ll2);
	
}
}
