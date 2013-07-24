package com.sandbox.algorithms;

public class StringPermutations {
	  public static void main(String args[]) {
	    permuteString("", "abcd");
	  }

	  public static void permuteString(String beginningString, String endingString) {
		  System.out.println("Processing BS:"+beginningString+" ES: "+endingString);
	    if (endingString.length() <= 1)
	      System.out.println(beginningString + endingString);
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String part1 =  endingString.substring(0, i);
	          String part2=   endingString.substring(i + 1);
	          String newEndString = part1 + part2;
	          System.out.println("i="+i+"->"+part1+"+"+part2+"="+newEndString);
	          String newBeginningString = beginningString + endingString.charAt(i);
	          System.out.println("Permute:"+newBeginningString+","+newEndString);
	          permuteString(newBeginningString, newEndString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	  }
	}
