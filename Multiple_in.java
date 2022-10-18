package Practical.com;

 interface Mul {
	 //1st parent interface
 static int add (int a) {
	 return a+a;
 }
	void display();//1st method
	/*default void show() {//default method
		System.out.println("Default method");
	}
	}*/

class Demo123 implements Mul{
		public void display() {
			System.out.println("Hi");}
}		
public static void main(String[] args) {
	Mul obj=new Demo123();
	//obj.show();
	obj.display();
	System.out.println(Mul.add(3));
	
}
}

