package Practical.com.Exception;
//Exception handling using try -catch
public class TryCatch {
public static void main(String[] args) {
	try {//may exception occurs
		int num=25/0;
		System.out.println("The line will not run");}
	  catch(ArithmeticException e) {System.out.println(e);}
		catch(Exception r) {
			System.out.println("can't be divided by 0");//handling exception
			//System.out.println(25/5);
		}
	}
}

