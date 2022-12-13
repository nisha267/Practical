package Practical.com.Collection;

import java.util.LinkedHashSet;

public class LinkedHashseteg {
public static void main(String[] args) {
	LinkedHashSet<String>lh=new LinkedHashSet<String>();
	lh.add("Two");
	lh.add("one");
	lh.add("Three");
	lh.add("Four");
	lh.add("Five");
	System.out.println("Original list:"+lh);
	//removing specific element from the above mentioned list
	System.out.println(lh.remove("Two"));//two present so it will return true
	System.out.println("Updated list:"+lh);
	//six is not present
	//return false
	System.out.println(lh.remove("Six"));
}
}
