package com.sandbox.algorithms;

public class Factorial {
	
	public static void main(String[] args) {
		int factorial = 1;
		int n = 3;
		for(int i=1; i<=n; i++){
			factorial *= i;
		}
		
		System.out.println("Factorial.main() "+factorial);
	}

}
