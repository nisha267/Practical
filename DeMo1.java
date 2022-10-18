package Practical.com;

interface Inter {
	void show();
}
class Test implements Inter{
	public void show() {
		System.out.println("Hello my future employee");
	}
}
	class demo implements Inter{
		public void show() {
			System.out.println("Hello my future employee");
		}
	public static void main(String[] args) {
		Inter obj=new demo();
		
		obj.show();
	}
	}
