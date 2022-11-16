package Practical.com.Exception;
//invoke method on the null object
public class Nullpointer {
String str=null;//string value null
int arr[]=null;//array object null
String convert (String s) {
	return s.toUpperCase();
}
public static void main(String[] args) {
	Nullpointer obj=new Nullpointer();
	System.out.println(obj.convert(null));
	System.out.println(obj.arr.length);
	System.out.println(obj.str.equals("Nisha"));
}
}
