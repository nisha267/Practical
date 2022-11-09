package Practical.com.String;

public class MutableExString {
	public static void my() {
		//string Buffer
	StringBuffer s=	new StringBuffer("Hello");//object of string buffer
	s.append("World");//Hello World
	System.out.println("String is : "+s);
	s.replace(1,3,"java");//(Beginswith,endswith,string)
	System.out.println("Replace is :"+s);
	System.out.println("Capasity is :"+s.capacity());
	//StringBuilder
	
	StringBuilder s1=new StringBuilder("World");//s1=world
	s1.replace(1, 3, "Java");
	System.out.println("Replace is: "+s1);
	
	s1.delete(1,3);
	System.out.println("Delete is: "+s1);
	
s1.reverse();
System.out.println("Reverse is: "+s1);
}
	public static void main(String[] args) {
		my();
	}


}
