package com.sandbox.algorithms;

public class Palindrome {

	static boolean isPalindrome(String s){
		
		int middle = s.length() / 2;
		for(int i =0; i < middle + 1 ; i++){
			if(s.charAt(i) != s.charAt(s.length() -i -1))
				return false;
		}
		
		return true;
	}
	
}
	