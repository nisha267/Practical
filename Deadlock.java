package Practical.com.Thread;

public class Deadlock {
	public static void main(String[] args) {
		final String Sourse1="Shifa";
		final String Sourse2="Nisha";
		Thread t1=new Thread(){
		public void run() {
			synchronized (Sourse1) {
				System.out.println("T1 lock Sourse1");
				try {
					Thread.sleep(200);
				}catch(Exception e) {}
				synchronized (Sourse2) {
					System.out.println("T1 lock Sourse2");
			}
		}
	}

};
Thread t2=new Thread() {
	public void run() {
		synchronized (Sourse2) {
			System.out.println("T2 lock Sourse2");
			try {
				Thread.sleep(200);
			}catch(Exception e) {}
			synchronized (Sourse1) {
				System.out.println("T2 lock Sourse1");
		}
	}
}

};
t1.start();
t2.start();
}}
