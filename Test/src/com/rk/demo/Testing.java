package com.rk.demo;

import java.util.Scanner;

public class Testing{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<n ; i++)
			arr[i] = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i = 0; i<n; i++) {
			if(Math.abs(arr[i]) >= start && Math.abs(arr[i])<=end)
				System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}