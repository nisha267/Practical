package Practical.com;
class Vehicle3{//parent class
	void running() {
		System.out.println("Running mode on");
	}}

class Bike2 extends Vehicle3{//child class 1
 void run() {
	 System.out.println("Bike run mode on");
 }}
class car1 extends Vehicle3{//child class 2
	 void speed() {
		 System.out.println("Car speed is vey high");
	 }}

public class Hierarchical {
	public static void main(String[] args) {
		Bike2 b=new Bike2();
		b.running();
		b.run();
		car1 c=new car1();
		c.running();
		c.speed();
		
	}

}
