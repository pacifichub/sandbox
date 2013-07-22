package com.sandbox.java.equals;

public class Equals {
	public static void main(String[] args) {
		String abc = "abc";		
		String lmn = new String("abc");
		String xyz = "abc";
		
		System.out.println("Equals.main()"+(abc == xyz));
		System.out.println("Equals.main()"+(abc == lmn));
	}

}
