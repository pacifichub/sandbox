package com.sandbox.algorithms;

/**
 * 
 * Return an array that contains exactly the same numbers as the given array, 
 * but rearranged so that every 3 is immediately followed by a 4. 
 * Do not move the 3's, but every other number may move. T
 * he array contains the same number of 3's and 4's, 
 * every 3 has a number after it that is not a 3 or 4, 
 * and a 3 appears in the array before any 4. 

fix34({1, 3, 1, 4}) → {1, 3, 4, 1}
fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}
fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
 *
 */


public class Return34 {
	
	public int[] arrange(int[] nums){
		
		for(int i=0; i<nums.length; i++){
			
			if(nums[i] == 3){
				for(int j=i+1; j<nums.length; j++){
					if(nums[j] == 4){
						nums[j] = nums[i+1];
						nums[i+1] = 4;
					}
						
				}
			}
			
			if(nums[i] == 4 && nums[i-1] != 3){
				for(int j=i+1; j<nums.length-1; j++){
					if(nums[j] == 3){
						nums[j] = nums[i+1];
						nums[i+1] = 4;
					}
						
				}
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums1 =  {3, 2, 2, 4};
		nums1 = (new Return34()).arrange(nums1);
		for(int i: nums1){
			System.out.print(" "+i+" ");
		}
		
		
	}

}
