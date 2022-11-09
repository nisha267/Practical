package Practical.com.String;
//represent any object to string,we can return value of object instead of hashcode
public class Tostring {
	int roll_no;
	String Name,address;
	Tostring(int roll_no,String Name,String address){
		this.roll_no=roll_no;
		this.Name=Name;
		this.address=address;
		
	}
	public String toString()//return object into string
	{
   return roll_no+" "+Name+" "+address;
	}
public static void main(String[] args) {
	Tostring t=new Tostring(1,"Nisha","Asansol");
	Tostring t1=new Tostring(2,"Shifa","Andal");
	System.out.println(t);
	System.out.println(t1);
}
}
