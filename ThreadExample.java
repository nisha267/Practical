package Practical.com.Thread;//package name

public class ThreadExample extends Thread {//creating a class by extending thread class
	public void run() {//create run method to print the statement//in this step the thread will run
		System.out.println("I am thread...thread is running");
	}
	public static void main(String[] args) {//main method
		ThreadExample t=new ThreadExample();//creating object of threadExample class
		t.start();//starting the thread
		t.setName("Nisha");//changing the thread name
		//t.run();//can also write it to run thread method
		String s=t.getName();//getting the name of the 1st thread
		
		System.out.println(s);//printing the new name
	}

}
