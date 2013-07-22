package com.sandbox.algorithms;

public class RemoveDuplicates {

	
	private static String removeDuplicates(String original) {
	    if (original == null) 
	        return "";
	    char[] chars = original.toCharArray();
	    int length = chars.length;
	    for (int current = 0; current < length; current++) {
	        // compare the current char with all following chars
	        // and delete it if one of them is the same
	        for (int next = current + 1; next < length;) {
	        	System.out.println("Processing Outer "+chars[current]+" v/s Inner "+chars[next]);
	            if (chars[current] == chars[next]) { 
	                // found a duplicate, need to delete it
	                length--;
	                for (int gap = next; gap < length; gap++) {
	                    // delete the duplicate and left-shift all remaining chars
	                    chars[gap] = chars[gap + 1];
	                }
	            } else
	                next++;
	                // current character is unique, move on
	        }
	    }
	    return new String(chars, 0, length);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		char[] str = "helloworld".toCharArray();
		System.out.println("RemoveDuplicates.main()"+removeDuplicates("aaaaaa"));
		

	}

}
