package com.rk.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Flower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<size; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		Arrays.sort(arr, 0, k);
		for(int i = k-1; i<size-1;i++) {
			for(int j = k ; j<size-1;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<size;i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}
}