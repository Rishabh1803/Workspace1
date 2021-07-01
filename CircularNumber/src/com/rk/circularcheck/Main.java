package com.rk.circularcheck;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularNumber circularnumber = new CircularNumber();
		System.out.print("Enter Number: ");
		circularnumber.setNumber(sc.nextInt());
		boolean circular = circularnumber.isCircular();
		System.out.println("Circular : " + circular);
		sc.close();
	}
}