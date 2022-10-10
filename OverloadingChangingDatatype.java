package Practical.com;

public class OverloadingChangingDatatype {
	
	
		static int sum(int a,int b) {//int argument
			return a+b;}
			static double sum(double a,double b,double c)	{//double arguments
			return a+b+c;
			}
			public static void main(String[]args) {
				System.out.println(OverloadingChangingDatatype.sum(5,6));
				System.out.println(OverloadingChangingDatatype.sum(5.6,6.8,8.6));
			}
			
		}





