package Practical.com;

 interface Multiple_in1 {//1st parent interface
	void show();
	}
interface Multiple_in2{//2nd parent interface
	void show();}
class Multiple_in implements Multiple_in1,Multiple_in2{
		public void show() {
			System.out.println("Hi");}
			
public static void main(String[] args) {
	Multiple_in obj=new Multiple_in();
	obj.show();
	
	
}
}

