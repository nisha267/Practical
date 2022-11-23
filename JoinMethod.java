package Practical.com.Thread;

public class JoinMethod extends Thread {
	public void run()
	{
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}System.out.println(i);
		}
	}
public static void main(String[] args) {
	JoinMethod j=new JoinMethod();
	JoinMethod j1=new JoinMethod();
	JoinMethod j2=new JoinMethod();
	j.start();
	try {
		j.join();
	}catch(Exception e) {
		System.out.println(e);}
	j1.start();j2.start();
	}}
	
	
