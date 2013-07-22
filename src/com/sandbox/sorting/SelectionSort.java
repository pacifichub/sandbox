package com.sandbox.sorting;

public class SelectionSort {

	private static int[] selectionSort(int[] arrayToSort){
		
		int length = arrayToSort.length;
		int min = 0;
		
		for(int i=0; i<length; i++){
			min = i;
			for(int j=i+1; j<length; j++){
				if(arrayToSort[j] < arrayToSort[min])
					min = j;
			}
			
			if(min != i){
				int temp = arrayToSort[i];
				arrayToSort[i] = arrayToSort[min];
				arrayToSort[min] = temp;
			}
		}
		
		
		return arrayToSort;
	}
	
	
	public static void main(String[] args) {
		int[] arrayToSort = {9,1,3,4,5};
		for(int i : arrayToSort){
			System.out.print(i +" ");
		}
		System.out.println();
		int[] selectionSortedArray = selectionSort(arrayToSort);
		for(int i : selectionSortedArray){
			System.out.print(i +" ");
		}
	
	}
}
