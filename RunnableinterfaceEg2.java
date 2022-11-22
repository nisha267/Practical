package Practical.com.Thread;
//thread(Runnable obj,String name)
public class RunnableinterfaceEg2 implements Runnable {//main class implementing Runnable interface
	public void run() {//run method
		System.out.println("Thread running");}
	public static void main(String[] args) {//main method
		Runnable r=new RunnableinterfaceEg2();//object of runnable by using the main class
		Thread t=new Thread(r,"String name");//object of thread class
		t.start();//starting threads
		String s=t.getName();//getting name
		System.out.println(s);
	}
	}


