package Practical.com;

 class FinalMethod {
	final void display() {
		System.out.println("This is final method");
	}


/*class Main extends FinalMethod{
	//try to override method
	Public final void display() {
		System.out.println("Final method is overridden");
	}*/
	public static void main(String[] args) {
		FinalMethod obj=new FinalMethod();
		obj.display();
	}
}