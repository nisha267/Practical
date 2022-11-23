package Practical.com.Thread;
//directly we use thread class without extends
//with and without set name we can name the thread
public class Threadeg2 {
	
	public static void main(String[] args) {
		Thread t=new Thread("Pallabi");
		Thread t1=new Thread();
		t.start();
		t1.start();
		t1.setName("Nisha");
		System.out.println("Thread 0:"+t.getName());
		System.out.println("Thread 1:"+t1.getName());
}}
