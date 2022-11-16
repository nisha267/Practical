package Practical.com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedException {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two numbers");
	try {
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println(" "+(x/y));
	}
	catch(InputMismatchException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
