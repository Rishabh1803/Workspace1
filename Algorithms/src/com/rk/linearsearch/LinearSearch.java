package com.rk.linearsearch;

public class LinearSearch {
	private int arr[];

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public LinearSearch(int[] arr) {
		super();
		this.arr = arr;
	}
	public LinearSearch() {
		
	}
	public int linearSearch(int key) {
		for(int i = 0;i<arr.length; i++) {
			if(arr[i] == key)
				return i;
		}
		return -1;
	}
}
