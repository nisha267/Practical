package demo;

//create  object without new keyword
class AnotherClass {// another class
	// data members of another class
	String name;
	int age;
}

public class WithoutNew {// class
	public static void main(String[] args) {// main method
		try {// creating objects using newInstance method
			AnotherClass o1 = AnotherClass.class.newInstance();
			AnotherClass o2 = AnotherClass.class.newInstance();
			AnotherClass o3 = AnotherClass.class.newInstance();
			AnotherClass o4 = AnotherClass.class.newInstance();
			AnotherClass o5 = AnotherClass.class.newInstance();
//initializing data members of objects
			o1.name = "a";
			o1.age = 20;
			o1.name = "b";
			o1.age = 30;
			o1.name = "a";
			o1.age = 40;
			o1.name = "a";
			o1.age = 50;
			o1.name = "a";
			o1.age = 60;
			System.out.println("Name=" + o1.name + "Age=" + o1.age);
			System.out.println("Name=" + o1.name + "Age=" + o1.age);
			System.out.println("Name=" + o1.name + "Age=" + o1.age);
			System.out.println("Name=" + o1.name + "Age=" + o1.age);
			System.out.println("Name=" + o1.name + "Age=" + o1.age);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
