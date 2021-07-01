package com.rk.insertionsorting;

import java.util.Scanner;

public class MainInsertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr= new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		InsertionSort select = new InsertionSort(size, arr);
		select.sort();
		System.out.println("After sorting: ");
		select.display();
		sc.close();
	}
}
