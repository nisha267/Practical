package Practical.com;

import java.util.ArrayList;

public class Unboxingeg {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	//autoboxing
	a1.add(5);
	a1.add(2);
	System.out.println("ArrayList:"+a1);
	//unboxing
	int a=a1.get(0);
	int b=a1.get(1);
	//5 Integer convert to int
	System.out.println("value of index 0:"+a+" "+b);
}
}
