package com.rk.binarysearch;

import java.util.Arrays;

public class BinarySearch {
	private int[] arr;
	public BinarySearch() {		
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public BinarySearch(int[] arr) {
		super();
		this.arr = arr;
	}
	public int binarySearch(int[] array, int low, int high, int key) {
		Arrays.sort(array);
		if(low<=high) {
			int mid = (low + high)/2;
			if(array[mid] == key) {
				return mid;
			}
			else if(key < array[mid]) {
				return (binarySearch(array, low, mid-1, key));
			}
			else if(key>array[mid])
				return binarySearch(array,mid+1, high, key);
		}
		return -1;
	}
}