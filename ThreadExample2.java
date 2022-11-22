package Practical.com.Thread;

public class ThreadExample2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(800);}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadExample2 t1=new ThreadExample2();
		ThreadExample2 t2=new ThreadExample2();
		ThreadExample2 t3=new ThreadExample2();
		t1.start();
		t2.run();
		t3.run();
	}

}
