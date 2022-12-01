package Practical.com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferredOS {
	public static void main(String[] args) {
		try {
			FileOutputStream f= new FileOutputStream("C:\\TestInputoutput\\Test2.txt");
				BufferedOutputStream b=new BufferedOutputStream(f);
				String s="Welcome to coding world";
				byte b1[]=s.getBytes();//changing string to bye array
				f.write(b1);//write() is used to write write in file
				f.close();
				b.close();
				System.out.println("Done");
			}
	catch(Exception e) {
				System.out.println(e);
			}
		}
		}
	