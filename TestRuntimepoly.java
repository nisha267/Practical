package Practical.com;
//runtime polymorphism--method overriding
class Runtimepoly{
	int value=50;
	void show() {
		System.out.println("show anything");
	}
}
class TestRuntimepoly extends Runtimepoly  {
	int value=70;
	void show() {
		System.out.println("Show nothing");
	}
//reference variable of parent class refers to the objects of child class	
public static void main(String[] args) {
	Runtimepoly obj= new TestRuntimepoly();//upcasting
	obj.show();
	System.out.println("Value is :"+obj.value);
}
}
