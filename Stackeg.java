package Practical.com.Collection;

import java.util.Stack;

public class Stackeg {
	public static void main(String[] args) {
Stack<Integer> s=new Stack<>();
boolean result=s.empty();
System.out.println("Is the stack empty? "+result);
//adding elements(push)
s.push(25);
s.push(35);
s.push(40);//2
s.push(80);//1
s.push(75);//0
//result
System.out.println("Stack element: "+s);//result
Integer digit=s.peek();//access element from the top of the stack
System.err.println("Top element: "+digit);
System.out.println("Stack elements after peek:"+s);
Integer digit2=s.pop();
System.err.println("Top element: "+digit2);
System.out.println("Stack elements after pop:"+s);
Integer digit1=s.search(35);//search any element
System.err.println("Search element "+digit1);
int x=s.size();//find the size of the stack
System.out.println("Stack size"+x);
result=s.empty();//checking empty or not
System.out.println("Is the stack empty? "+result);
}}
