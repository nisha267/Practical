package Practical.com;
//we can read only(only getter method)
//we can write only(only setter method)
public class Read_WriteOnlyEn {
	//private String name="Nisha";
	private String name;
	//public String getName() {
	//return name;
	public void setName(String name) {
		this.name=name;
	}
public static void main(String[] args) {
	Read_WriteOnlyEn obj=new Read_WriteOnlyEn();
//	obj.set_name("Pallabi");//we can't change the value of the name
	//System.out.println("Name : "+obj.getName());
	obj.name="Nisha";
	System.out.println(obj.name);
}
}
