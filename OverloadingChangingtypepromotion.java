package Practical.com;

public class OverloadingChangingtypepromotion {//class
    void add(int a,long b) {//method 1
    System.out.println(a+b);
    }
    void add(int a,int b,int c) {//method 1
        System.out.println(a+b+c);
}
    public static void main(String[] args) {
    	OverloadingChangingtypepromotion obj= new OverloadingChangingtypepromotion();	
	obj.add(2, 3);
	obj.add(10,30,20);
    }}
