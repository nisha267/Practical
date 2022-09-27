package Practical.com;


import java.io.*;
public class Pattern {
	public static void printpattern(int n)//method to print pattern
	{//outer loop to handle no of rows,n in this case
		for(int i=0;i<=n;i++) {
			//inner loop for handle the numbers space
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
		//innner loop to handle no of coloumns
		for(int j=0;j<i;j++) {
			System.out.print("* ");	
			}//ending line after each row
		System.out.println();
	}}
	public static void main(String[] args) {
		int n=5;
		printpattern(n);
	}

}



