package Practical.com;
class TestOverriding{
	void run() {
		System.out.println("Running mode on");	
}}
	//creating child class
public class Methodoverridding extends TestOverriding {
	void run() {//method 2
		System.out.println("Running mode off");
	}
public static void main(String[] args) {
	//creating a object of child class
	Methodoverridding m=new Methodoverridding();
	m.run();
}}
	
