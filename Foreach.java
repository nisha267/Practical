package Practical.com;

public class Foreach {
	public static void main(String[] args) {
		//declaring array
		int sum=0;
		int arr[]= {1,2,3,4,5};//1+2+3+4+5
		for(int i:arr) {
			System.out.println(i);
			sum=sum+i;
			System.out.println("Sum is "+sum);
		}
	}}


