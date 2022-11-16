package Practical.com.Exception;

public class ThrowUnchecked {
	public static void eligible(int age) {
		if(age<18) {
			throw new ArithmeticException("u are not eligible for vote");
		}
		else {
			System.out.println("Person eligible for vote");
		}}
     public static void main(String[]args) {
    	 eligible(12);
    	 System.out.println("Done");
	}

}
