package Practical.com.Thread;

public class RunnableInterfaceThread implements Runnable {
	public void run() {//run method
		System.out.println("I am thread...thread is running");
		}
	public static void main(String[] args) {//main method
		RunnableInterfaceThread r=new RunnableInterfaceThread();//creating the main class object
	Thread t=new Thread(r);//object of thread class and giving the object
		t.start();//calling start method
	}

}
