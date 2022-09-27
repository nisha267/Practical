package Practical.com;
//display default value
//display default constructor
public class Parameterizedcons {
	int age;
	String name;
	Parameterizedcons(int a,String n){
		age=a;
		name=n;
	}
	void show() {//method to display age and name
		System.out.println(age+ " "+name);
	}
public static void main(String[] args) {
	//1st object for age and name
	Parameterizedcons d=new Parameterizedcons(45,"Riya");
	//2nd object for age and name
	Parameterizedcons d1=new Parameterizedcons(23,"Sita");
		d.show();
		d1.show();
	}
	
}