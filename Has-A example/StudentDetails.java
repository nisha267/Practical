package Practical.com;

public class StudentDetails {
	int id;
	String name;
	student_address address;//ref entity
public StudentDetails(int id,String name,student_address address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.district);
}
public static void main(String[] args) {
	student_address a1=new student_address("Newtown","South Kolkata","Kolkata");
	StudentDetails d1=new StudentDetails(1,"Nisha",a1);
}
}
