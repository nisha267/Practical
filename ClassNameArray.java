package Practical.com;

public class ClassNameArray {
public static void main(String[] args) {
	//declaration and initialization of an array
	int arr[]= {1,2,3};
	//getting the class name
	Class a=arr.getClass();
	String name=a.getName();
	//print the class name
	System.out.println(a);
}
}
