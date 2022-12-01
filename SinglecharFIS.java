package Practical.com.io;

import java.io.FileInputStream;

public class SinglecharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f= new FileInputStream("C:\\TestInputoutput\\Test2.txt");
		int i=f.read();
		
			System.out.println((char)i);
		
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
	


