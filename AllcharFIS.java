package Practical.com.io;

import java.io.FileInputStream;


public class AllcharFIS {
public static void main(String[] args) {
	try {
		FileInputStream f= new FileInputStream("C:\\TestInputoutput\\Test2.txt");
		int i=0;
		while((i=f.read())!=-1) {
			System.out.println((char)i);
		}
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
