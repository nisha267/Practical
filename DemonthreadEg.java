package Practical.com.Thread;

public class DemonthreadEg extends Thread {
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());
		System.out.println("Demon:"+Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("i am demon Thread");
		}
		else {
			System.out.println("I am user thread");}
	}
	public static void main(String[] args) {
		DemonthreadEg d=new DemonthreadEg();
		DemonthreadEg d1=new DemonthreadEg();
		d.start();
		d.setDaemon(true);
		d1.start();
	}
		
	}


