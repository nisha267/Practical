package Practical.com.io;
import java.io.FileOutputStream;

public class FileinputoutputStream {
public static void main(String[]args) {
	try {
		FileOutputStream f= new FileOutputStream("C:\\TestInputoutput\\Test2.txt");
		String s="Welcome to Anudip Foundation";
		byte b[]=s.getBytes();//changing string to bye array
		f.write(b);//write() is used to write write in file
		f.close();
		System.out.println("Done");
	}catch(Exception e) {
		System.out.println(e);
	}
}
}