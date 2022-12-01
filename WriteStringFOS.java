package Practical.com.io;

import java.io.FileOutputStream;

public class WriteStringFOS {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("C:\\TestInputoutput\\Test2.txt");
		f.write(67);
		f.close();
		System.out.println("done");}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
