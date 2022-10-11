package Practical.com;

class Shape{
	String name="Circle";
}
class Size extends Shape{
	String name="Triangle";
	void print() {
		System.out.println(super.name);
		System.out.println(name);
	}
}
public class Supermain {
	public static void main(String[] args) {
		Size s=new Size();
		s.print();
	}

}
