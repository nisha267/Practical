package demo;

public class Armstrong {
	public static void main(String args[]) {
		int num = 371, n, rem, r = 0;
		n = num;
		while (n != 0) {
			r = n % 10;
			r += Math.pow(rem, 3);
			n /= 10;
		}
		if (r == num)// to check result equal to number or not
			System.out.println(num + "is a armstrong number");
		else
			System.out.println(num + "is not a armstrong number");
	}
}
