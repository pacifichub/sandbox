package com.sandbox.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.) 

maxSpan({1, 2, 1, 1, 3}) → 4
maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
 * 
 * 
 */

public class MaxSpan {

	public int maxSpan(int[] nums) {
		  int maxSpan = 0;
		  
		  for(int i=0; i<nums.length; i++){
			  
			  for(int j=i+1; j< nums.length; j++)
			  {
				  if(nums[i] == nums[j])
				  {
					  int span = getSpan(i, j);
					  if(span > maxSpan)
						  maxSpan = span;
				  }
			  }
		  }
		  
		  return maxSpan;
		}
	
	public int getSpan(int start, int end){
		return (end-start + 1);
	}

	public static void main(String[] args) {
		int[] num1 = {1,2,1,1,3};
		MaxSpan m = new MaxSpan();
		System.out.println("MaxSpan.main() num1 "+m.maxSpan(num1));
		
		int[] num2 = {1, 4, 2, 1, 4, 1, 4};
		System.out.println("MaxSpan.main() num2 "+m.maxSpan(num2));
		
		int[] num3 = {1, 4, 2, 1, 4, 4, 4};
		System.out.println("MaxSpan.main() num3 "+m.maxSpan(num3));
		
		
	}
}
