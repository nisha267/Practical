package Practical.com.String;

import java.util.StringTokenizer;

//simple way to break a string,package java.util.StringTokenizer
public class StringTokenizerEg {
public static void show() {//show method
	StringTokenizer st=new StringTokenizer("Anudip foundation Skill and career development center");
while(st.hasMoreTokens()) {//boolean method,it checks if there is more token available or not
	System.out.println();
	System.out.println(st.nextToken(" "));//string method,it returns the next token from string tokenizer object
	StringTokenizer st1=new StringTokenizer("I am Nisha");
	while(st1.hasMoreTokens()) {
		System.out.print(st1.nextToken(","));
	
}}}
public static void main(String[] args) {
	show();
}}
