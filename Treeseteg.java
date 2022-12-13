package Practical.com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeseteg {
public static void main(String[] args) {
	//creating and adding elements
	TreeSet<String>set=new TreeSet<String>();
	set.add("A");
	set.add("N");
	set.add("D");
	set.add("P");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("V");
	set.add("C");
	set.add("R");
	
	System.out.println("Original set:"+set);
	Iterator itr=set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
		System.out.println("Lowest value:"+set.pollFirst());
		System.out.println("Updated set after PollFirst:"+set);
		System.out.println("Highest value:"+set.pollLast());
		System.out.println("Updated set after PollLast:"+set);
		System.out.println("Reverse set:"+set.descendingSet());
		
		//follows the ascii values
		System.out.println("Head set:"+set.headSet("D"));//Before D all elements who are present
		System.out.println("Sub set:"+set.subSet("C","N"));//printing all the strings who are between C and N,obviously they have to present in treeSet
		System.out.println("Tail set:"+set.tailSet("O"));//after O all elements who are present
	
	
}
}
