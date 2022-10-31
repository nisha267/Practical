package Practical.com;

public class Arrayexample2 {
public static void main(String[] args) {
	int a[]=new int[5];//declaration & instantiation
	a[0]=2;
	a[1]=4;
	a[2]=9;
	a[3]=8;
	a[4]=5;
	//int a[]= {2,4,9,8,8};//array anonymous
	//traversing array or printing array
	//for(int i:a){//for each loop
for(int i=0;i<a.length;i++) 
	System.out.println(a[i]);
	
	}	
}

