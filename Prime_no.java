package Practical.com;

import java.util.Scanner;

public class Prime_no {
public static void main(String[]args) {
	int n,i,count=0;
	Scanner sc=new Scanner(System.in);//syntax of scanner class
System.out.println("Enter the number");
n=sc.nextInt();
for(i=2;i<n;i++) {
	if(n%i==0) {
		count++;
		break;
	}
	}if(count==0)
		System.out.println(" It is a prime number.");
	else
		System.out.println("It is not a prime number.");
	
}
}
