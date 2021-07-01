package com.rk.selectionsorting;

import java.util.Scanner;

public class MainSelection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr= new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort select = new SelectionSort(size, arr);
		select.sort();
		System.out.println("After sorting: ");
		select.display();
		sc.close();
	}
}
