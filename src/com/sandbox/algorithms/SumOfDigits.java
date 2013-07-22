package com.sandbox.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigits {
	
	public static int getSum(String s)
	{
	  
	  if(s == null || s.isEmpty())
	    return 0;
	  
	  char[] charStr = s.toCharArray();
	  int total = 0;
	  List<String> allNumbersInThisString = new ArrayList<String>();
	   StringBuilder nextNumber = null;
	  for(int i = 0; i < charStr.length;)
	    {
		  System.out.println("i= "+i+"  "+charStr[i]);
	      if(Character.isDigit(charStr[i])){
	       // Find if consecutive character is a number 
	      nextNumber = new StringBuilder();
	      nextNumber.append(charStr[i]);
	      // Loop starting from i+1 until we find the next alphabet 
	      for(int j = i+1 ; j < charStr.length;)
	      {
	    	  System.out.println("j= "+j+"  "+charStr[j]);
	        if(Character.isDigit(charStr[j])){
	          nextNumber.append(charStr[j]);
	          j++;
	        }
	        else{
	          // we found an alphabet, so add the digits we found from j to here.
	          allNumbersInThisString.add(nextNumber.toString());
	          // i will now begin after this number has ended. 
	          i = ++j;
	          break;
	        }
	      }
	      }
	      else{
	    	  i++;
	      }
	      
	    }
	    
	    for(String number : allNumbersInThisString){
	      total += Integer.valueOf(number);
	    }
	    
	    return total;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String  s = "1 3";
		
		System.out.println(s.length());
		
		System.out.println(getSum(s));

	}

}
