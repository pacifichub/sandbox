package com.sandbox.algorithms;

public class PrimeNumber {
	
	//checks whether an int is prime or not.
	boolean isPrimeAllN(int n) {
	    for(int i=2; i<n; i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	/*Consider that if 2 divides some integer n, then (n/2) divides n as well. This tells us we don’t have to try out all integers from 2 to n. Now we can modify our algorithm:*/
	
	//checks whether an int is prime or not.
	boolean isPrimeNBy2(int n) {
	    for(int i=2; 2*i<n; i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	/*  we notice that you really only have to go up to the square root of n, because if you list out all of the factors of a number, the square root will always be in the middle (if it happens to not be an integer, we’re still ok, we just might over-approximate, but our code will still work).

		Finally, we know 2 is the “oddest” prime – it happens to be the only even prime number. Because of this, we need only check 2 separately, then traverse odd numbers up to the square root of n. In the end, our code will resemble this: */
	
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3; i*i<=n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	 public static void main(String[] args) {
		
	}

}
