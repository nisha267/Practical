package Practical.com.String;
//char[]work same as java string
public class StringExample2 {
public void show() {//method 1
	char[]arr= {'j','a','v','a'};//char type array
	String s=new String(arr);
	System.out.println("Value is:"+s);
	System.out.println(arr);}
	public void myFunction()//method 2
	{
		String m="Pallabi";
		
		String m1=new String(m);
		System.out.println(m1);
	}
	public static void main(String[] args) {
		StringExample2 s=new StringExample2();
		s.show();
		s.myFunction();
		
	}
}

