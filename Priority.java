package Practical.com.Thread;

public class Priority  extends Thread{
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
		Priority  t1=new Priority ();
		Priority t2=new Priority ();
		Priority  t3=new Priority ();
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority()+" "+Thread.currentThread().getName());
		t1.start();
		t2.start();
		t3.start();
		t1.setName("riya");
		
		System.out.println(t1.getName());
		}
		
	}




