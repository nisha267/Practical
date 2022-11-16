package Practical.com.Exception;
//only 1st exception will execute(multiple catch)
public class Multicatch {
static void mFunc() {
	try {
		int i=50/0;//arithmetic exception
		System.out.println(i);//arithmetic
		int arr[]=new int[3];//array index out of bound
		arr[4]=24;}
	catch(ArithmeticException e) {
		System.out.println("Only 1st arithmetic exception will execute");
		
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("Now Array index out of bound will occure");}
	finally {
		System.out.println("I am finally block");
		
	}}
public static void main(String[] args) {
	mFunc();
}
}

