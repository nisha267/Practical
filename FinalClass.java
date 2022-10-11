package Practical.com;
//we can not inherit or extend final class
/*final*/public class FinalClass {}
class test extends FinalClass{
	void show() {
		System.out.println("Nothing");
	}
	public static void main(String[] args) {
		test t=new test();
		t.show();
	}
}