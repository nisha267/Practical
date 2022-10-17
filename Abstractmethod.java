//class A{//the class should be abstract
//abstract void show()//abstract method
package Practical.com;
abstract class Testabstract{//abstract class and parent class
	abstract void display();//abstract method
void show() {//non abstract method
	System.out.println("Non abstract method invoked");
}}

class Demo1 extends Testabstract {//1st child class
	void display() {
		System.out.println("Display method invoked");
	}}
	class Demo2 extends Testabstract {//1st child class
		void display() {
			System.out.println("Demo2 method invoked");
		}}
	class AbstractMethod{
public static void main(String[] args) {
	Testabstract obj=new Demo1();
	Testabstract obj1=new Demo2();
	obj.display();
	obj1.display();
}
}
