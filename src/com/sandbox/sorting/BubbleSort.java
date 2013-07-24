package com.sandbox.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] input =  {4,6,2,5,1};
		
		int l = input.length;
		
		boolean swapOccured = false;
		
		for(int x = 0; x < l ; x++) { 
			printArray(input, "X");
		    swapOccured = false;
		    for(int y = 0; y < l-1; y++) { 
		    	printArray(input, "Y");
		      if(input[y] > input[y+1]) { 
		        int holder = input[y+1]; 
		        input[y+1] = input[y]; 
		        input[y] = holder; 
		        swapOccured = true;
		      } 
		    }
		    if (!swapOccured) break; 
		
		}
		
	}
	
	private static void printArray(int[] input, String loop){
		System.out.print("\n"+loop+": ");
		for(int i:input){
			System.out.print(i +" ");
		}
	}
}
