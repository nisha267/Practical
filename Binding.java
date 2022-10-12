package demo;

/*public class Binding {
	private void display() {
		System.out.println("samjhe");
	}
public static void main(String[] args) {
	Binding obj=new Binding();
	obj.display();
	
	
}
}*/
class TestBinding {
	void show() {
		System.out.println("samjhe");
	}
}

class Binding extends TestBinding {
	void show() {
		System.out.println("Ab samjhe");
	}

	public static void main(String[] args) {
		Binding obj = new Binding();
		obj.show();

	}
}
