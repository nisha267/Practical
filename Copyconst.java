package Practical.com;

public class Copyconst {
	//variable along with data type
	int age;
	String name;
	Copyconst(int a,String n){//using constructor
		age=a;
		name=n;
	}
	/*Copyconst()//using default constructor
	{}*/
//constructor to initialize another object
Copyconst(Copyconst c)//using constructor
  {
	age=c.age;
	name=c.name;}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		Copyconst c1=new Copyconst(22,"Nisha");//using constructor
		Copyconst c2=new Copyconst(c1);//using constructor
		/*Copyconst c2=new Copyconst();//using default constructor
		c2.age=c1.age;
		c2.name=c1.name;*/
		c1.show();
		c2.show();
	}
}
