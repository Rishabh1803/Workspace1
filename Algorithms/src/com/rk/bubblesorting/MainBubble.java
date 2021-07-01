package com.rk.bubblesorting;

import java.util.Scanner;

public class MainBubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] arr= new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		BubbleSort bubble = new BubbleSort(size, arr);
		bubble.sort();
		System.out.println("After sorting: ");
		bubble.display();
		sc.close();
	}
}
