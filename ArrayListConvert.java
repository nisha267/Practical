package Practical.com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	List<String>a1=new ArrayList<String>();
	a1.add("Rose");
	a1.add("Sunflower");
	
	a1.add("Lily");
	a1.add("Daisy");
	a1.add("Marigold");
	a1.add("Tulip");
	a1.add("Jasmine");
	//conversion of list to array
	System.out.println("List to Array");
	String[ ]arr=a1.toArray(new String[a1.size()]);
	for(String s:arr) {
		System.out.println(s);
	}
	//array to list
	System.out.println("Array to list");
	List<String>a11=new ArrayList<String>();
	a11=Arrays.asList(arr);
	System.out.println(a11);
	
}
}
