package com.sandbox.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] a = {5,6,2,1,7};
		
		int l = a.length;
		
		for(int i=1; i<l; i++){
			
			int temp = a[i];
			int j = i;
			System.out.println("i:"+i);
			while(j > 0 && a[j-1] > temp){
				System.out.println("j:"+j);
				a[j] = a[j-1];
				j--;
			}
			
			a[j] = temp;
		}
		
		for(int i: a){
			System.out.print(i+" ");
		}
		
		
	}

}
