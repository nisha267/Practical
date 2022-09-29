package Practical.com;

class Vehicle2{
	void running() {
		System.out.println("Running mode on");
	}}

class Bike1 extends Vehicle2{//child class
 void run() {
	 System.out.println("Bike run mode on");
 }}
class car extends Bike1{//child class
	 void speed() {
		 System.out.println("Car speed is vey high");
	 }}
public class Multilevel{
	public static void main(String[] args) {
	car c=new car()	;
	c.running();
	c.run();
	c.speed();
	}
}