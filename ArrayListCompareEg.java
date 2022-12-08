package Practical.com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {
public static void main(String[] args) {
	List<String>a11=new ArrayList<String>();//creating array list 1
	a11.add("Rose");//add property of array
	a11.add("Sunflower");
	a11.add("Lily");
	a11.add("Daisy");
	a11.add("Marigold");
	a11.add("Tulip");
	a11.add("Jasmine");
	System.out.println(a11);
	List<String>a12=new ArrayList<String>();
	a12.add("Rose");//list 2
	a12.add("Sunflower");
	a12.add("Lily");
	a12.add("Daisy");
	a12.add("Marigold");
	a12.add("Tulip");
	a12.add("Jasmine");
	System.out.println(a12);
	boolean b=a11.equals(a12);
	System.out.println(b);
	a11.add("Red rose");//add element
	boolean b1=a11.equals(a12);
	System.out.println(b1);
}
}
