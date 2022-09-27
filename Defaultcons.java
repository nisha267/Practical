package Practical.com;
//display default value
//display default constructor
public class Defaultcons {
	int age=34;
	String name="Rita";
	void show() {//method to display age and name
		System.out.println(age+ " "+name);
	}
public static void main(String[] args) {
	//1st object for age and name
	Defaultcons d=new Defaultcons();
	//2nd object for age and name
		Defaultcons d1=new Defaultcons();
		d.show();
		d1.show();
	}
	
}