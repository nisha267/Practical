package Practical.com.Regex;

import java.util.regex.*;

public class Regex {
	public static void main(String[] args) {
	//1st way
		Pattern p=Pattern.compile(".a");//single dot representation
		Matcher m=p.matcher("ma");//.a represent single character
		boolean b=m.matches();
		
		//2nd way
		boolean bb=Pattern.compile("..m").matcher("am").matches();
	//3rd way
		boolean b1=Pattern.matches(".a","sa");//true
		System.out.println(b+" "+bb+" "+b1);
		
		
	//single	//character class
		
		//[abc]=a,b,c[^abc]=any char except abc,[a-zA-z]=either upper/lower case and both
		boolean b5=Pattern.matches("[a-zA-z]","A");//any character between a to z
		boolean b6=Pattern.matches("[pqr]","pppqqqrrrr");//only one character from p,q,r
		boolean b7=Pattern.matches("[^abc]","r");//any character except a,b,c
		System.out.println(b5+" "+b6+" "+b7);
	
		
		//Quantifiers
		//x?--x occurs once or not at all   x+--x occur once or more than once
		//x*--occur zero or more time       x{n}--x occurs n times x{7}only 7 char
		//x{n,}--x occur n or more time x{7,}only 7 char or more
	boolean b8=Pattern.matches("[a-zA-Z0-9]{12,}","Anudip123ppp");
	System.out.println(b8);
	
	//meta char---/d=[0-9],/s---white space character,/w-[a-zA-Z-0-9}
	boolean b9=Pattern.matches("[6789]{1}[0-9]{9}","8927974283");
			boolean b10=Pattern.matches("[a-z0-9]+[@]{1}[a-z]+[.]{1}[com]{3}","nishasutradhar643@gmail.com");
			System.out.println(b9+" "+b10);
				}
	}
	


