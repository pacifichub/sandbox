package com.sandbox.algorithms;

public class Fibonacci {
	
	public static int recursiveFibonacci(int n){
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else 
			return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}

	public static int nonrecursiveFibonacci(int n){
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else{
			int a = 0; int b = 1; int c=0; 
			
			for(int i=0; i<n-2; i++){
				c = a + b;
				b = c;
				a = b;
			}
			return c;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Fibonacci.main()"+recursiveFibonacci(6));
		System.out.println("Fibonacci.main()"+nonrecursiveFibonacci(6));
	}
}
