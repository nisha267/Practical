package Practical.com.io;


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {
public static void main(String[] args)throws IOException {
	FileOutputStream f1= new FileOutputStream("C:\\TestInputoutput\\Test2.txt");
			FileOutputStream f2= new FileOutputStream("C:\\TestInputoutput\\Test.txt");
					ByteArrayOutputStream bout=new ByteArrayOutputStream();
					bout.write(65);
					bout.writeTo(f1);
					bout.writeTo(f2);
					bout.flush();
					bout.close();
					System.out.println("done");
}
}
