package Practical.com;

public class Thiskeyword {//class 1
	//instance variable
	int roll_no;
	String name;
	float fees;
	static String college="B B college";
	static void change() {//static method-we use this to change or modify anything
		college="Girls college";
	}
	
	//constructor
	Thiskeyword(int roll_no,String name,float fees){//local variable{
		this.roll_no=roll_no;
		this.name=name;
		this.fees=fees;
	}
	//method
	void display() {
		System.out.println(roll_no+" "+name+" "+fees+" "+college);
		
	}
	
		public static void main(String[] args) {
			Thiskeyword.change();//no need to create object of static method.just write class name.method name()
			//creating object
			Thiskeyword s1=new Thiskeyword(11,"Nisha",55000);
			Thiskeyword s2=new Thiskeyword(12,"Rita",55000);
			s1.display();
			s2.display();
			
		}
	}


