package Practical.com;
//Final keyword---cannot change the value of final method
public class FinalVariable {
	final int value=50;//final variable
void display() {
	System.out.println(value);
}
public static void main(String[] args) {
	FinalVariable fv=new FinalVariable();
	fv.display();
}
}
//we can not change final variable
//we can not override final method