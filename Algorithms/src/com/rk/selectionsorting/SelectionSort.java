package com.rk.selectionsorting;

/* --> The selection sorting algorithm is used to sort an array.
 * --> The good thing about selection sort is it never makes more than O(n) swaps and 
 * 	   can be useful when memory write is a costly operation. 
 * --> Sorting In Place: Yes
 * --> Stable: Yes
 * --> Auxiliary Space: O(1)
 * --> It has a complexity as follows:
 * --------------------------------------------------------------------------
 * 					|	Best Case	|	Average Case	|	Worst Case
 * --------------------------------------------------------------------------
 * Time Complexity	|	O(n^2)		|	O(n^2)			|	O(n^2)
 * --------------------------------------------------------------------------
 * Space Complexity	|	O(1)		|	O(1)			|	O(1)
 * --------------------------------------------------------------------------
 * */

public class SelectionSort {
	private int size;
	private int[] array;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public SelectionSort(int size, int[] array) {
		super();
		this.size = size;
		this.array = array;
	}
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort() {
		for(int i = 0; i<size-1;i++) {
			int pos = i;
			for(int j = i ; j<size; j++) {
				if(array[pos] > array[j])
					pos = j;
			}
			if(pos!=i)
				swap(array,i,pos);
		}
	}
	public void display() {
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}