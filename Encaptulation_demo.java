package Practical.com;

import java.util.Scanner;

public class Encaptulation_demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String stuname;
		int stupass,sid;
		int sub1,sub2,sub3,sub4,sub5;
		System.out.println("Enter your name");
		stuname=sc.nextLine();
		
		System.out.println("Enter your id");
		sid=sc.nextInt();
		System.out.println("Enter your password");
		stupass=sc.nextInt();
		System.out.println("Enter marks of 5 subjects :");
		System.out.println("Enter marks of subject 1");
		sub1=sc.nextInt();
		System.out.println("Enter marks of subject 2");
		sub2=sc.nextInt();
		System.out.println("Enter marks of subject 3");
		sub3=sc.nextInt();
		System.out.println("Enter marks of subject 4");
		sub4=sc.nextInt();
		System.out.println("Enter marks of subject 5");
		sub5=sc.nextInt();
		encap_d obj=new encap_d();
		obj.set_name(stuname);
		
		obj.set_name(sid);
		obj.set_pass(stupass);
		System.out.println("Name :"+obj.get_name());
		System.out.println("User id:"+obj.get_stu_id());
		System.out.println("Password :"+obj.get_pass());
		obj.calc(sub1, sub2, sub3, sub4, sub5);
		System.out.println("Percentage: "+obj.percentage);
	}}
class encap_d{//fully encaptulated class
//private data members
	private String student_name;
private int studentuser_id;
private int password;
int total,percentage;
public String get_name(){//using getter get name
return student_name;
}
public int get_stu_id(){//using getter get name
return studentuser_id;
}
public int get_pass(){//using getter get name
return password;
}
public void set_name(String stu){//using getter get name
student_name=stu;
}
public void set_name(int stu){//using getter get name
 studentuser_id=stu;
}
public void set_pass(int stu){//using getter get name
password=stu;
}
//calc is a method to calculate total marks
public void calc(int sub1,int sub2,int sub3,int sub4,int sub5)
{
	total=sub1+sub2+sub3+sub4+sub5;
	 percentage=total/5;

	if(percentage>=35 && percentage<=45) {
		System.out.println("D grade");}
	
else if(percentage>=45 && percentage<=55) {
	System.out.println("C grade");}

else if(percentage>=55 && percentage<=75) {
	System.out.println("B grade");}

else if(percentage>=75 && percentage<=85) {
	System.out.println("A grade");}

else if(percentage>=85 && percentage<=100) {
	System.out.println("O grade");}

else {
	System.out.println("fail");
}
}}
