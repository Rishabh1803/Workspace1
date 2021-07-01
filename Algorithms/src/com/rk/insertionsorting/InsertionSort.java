package com.rk.insertionsorting;

/* --> The insertion sorting algorithm is used to sort an array.
 * --> Insertion sort is used when number of elements is small. It can also be useful when input array is 
 * 		almost sorted, only few elements are misplaced in complete big array.
 * --> Sorting In Place: Yes
 * --> Stable: Yes
 * --> Auxiliary Space: O(1)
 * --> Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order.
 * 		And it takes minimum time (Order of n) when elements are already sorted.
 * --> Algorithmic Paradigm: Incremental Approach
 * 
 * 
 * --> It has a complexity as follows:
 * --------------------------------------------------------------------------
 * 					|	Best Case	|	Average Case	|	Worst Case
 * --------------------------------------------------------------------------
 * Time Complexity	|	O(n)		|	O(n^2)			|	O(n^2)
 * --------------------------------------------------------------------------
 * Space Complexity	|	O(1)		|	O(1)			|	O(1)
 * --------------------------------------------------------------------------
 * */
public class InsertionSort {
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
	public InsertionSort(int size, int[] array) {
		super();
		this.size = size;
		this.array = array;
	}
	
	public void sort() {
		for(int i = 1; i<size;i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0 && array[j] > key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	public void display() {
		for(int i = 0; i<size; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
