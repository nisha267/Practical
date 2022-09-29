package Practical.com;
//single inheritance
 class vehicle {//parent class
	void running() {
		System.out.println("Running mode on");
	}}
 class Bike extends vehicle{//child class
	 void run() {
		 System.out.println("Bike run mode on");
	 }}
class Vehicle1{
	public static void main(String[] args) {
		Bike b=new Bike();//object of child class bike
		b.run();//child class method
		b.running();//parent class method
	}
}
