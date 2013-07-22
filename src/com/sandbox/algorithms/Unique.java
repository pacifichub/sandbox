package com.sandbox.algorithms;

public class Unique {
	
	// something like bubble sort
	public static boolean isUnique3(String str) {
	    if (str.isEmpty()) {
	        return false;
	    }
	    char[] characters = str.toCharArray();
	    for (int i = 0; i< characters.length-1; i++) {
	        for (int j = i+1; j < characters.length; j++) {
	            if (characters[i] == characters[j]) {
	                return false;
	            }
	            else {
	                ;
	            }
	        }
	    }
	    return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Unique.main()  "+isUnique3("HeloW"));

	}

}
