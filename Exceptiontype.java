package Practical.com.Exception;

public class Exceptiontype {
	public void show() {
		String a="I am error";
		System.out.println(a);
		try {
			int i=50/0;//arithmetic exception
			System.out.println(i);
			String s="riya";
			System.out.println(s.length());
			int arr[]=new int[3];//new array
			arr[4]=24;//array index out of bound exception
			int m=Integer.parseInt(s);//number format exception
			System.out.println(m);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		String b="I can not be handle";
		System.out.println(a+" "+b);//i am error + i can not be handle
		}
		public static void main(String[]args) {
			Exceptiontype ec=new Exceptiontype();
			ec.show();
		}
	}


