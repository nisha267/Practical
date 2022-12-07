package Practical.com.io;

import java.io.FileWriter;

public class FileWriterEg {
	public static void main(String[] args) {
		try {
			FileWriter fw= new FileWriter("C:\\TestInputoutput\\Test.txt"); // Write
			fw.write("Hello World");	//prints in the file 
			fw.close();
			System.out.println("\nDONE");
		}catch(Exception e)  {
			System.out.println(e);
		}
	}
}

