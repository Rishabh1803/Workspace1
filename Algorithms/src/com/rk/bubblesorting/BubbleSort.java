package com.rk.bubblesorting;

/* --> The bubble sorting algorithm is used to sort an array.
 * --> Best case occurs when array is already sorted.
 * --> Worst case occurs when array is reverse sorted.
 * --> Sorting In Place: Yes
 * --> Stable: Yes
 * --> Auxiliary Space: O(1)
 * --> It has a complexity as follows:
 * -------------------------------------------------------------------------
 * 					|	Best Case	|	Average Case	|	Worst Case
 * --------------------------------------------------------------------------
 * Time Complexity	|	O(n)		|	O(n^2)			|	O(n^2)
 * --------------------------------------------------------------------------
 * Space Complexity	|	O(1)		|	O(1)			|	O(1)
 * --------------------------------------------------------------------------
 * */

public class BubbleSort {
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
	public BubbleSort(int size, int[] array) {
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
			int swapCount = 0;
			for(int j = 0 ; j<size-1-i; j++) {
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
					swapCount++;
				}
			}
			if(swapCount == 0)
				break;
		}
	}
	public void display() {
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
