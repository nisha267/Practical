package Practical.com;
//refer immediate after parent class constructor
	class Shape2{
		Shape2() {//by default public,parent class constructor
			System.out.println("Hello");
		}
	}
	class Size1 extends Shape2{//child class
		Size1() {//constructor of child class
			//invoke immediate parent class constructor line no 3
			super();
			System.out.println("Hi");
		}}
public class Superconstructor {
	
		public static void main(String[] args) {
			Size1 obj=new Size1();
			
		}

	}



