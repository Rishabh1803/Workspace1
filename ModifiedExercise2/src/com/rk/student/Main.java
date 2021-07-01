package com.rk.student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		Standard standard = new Standard(sc.nextInt());
		standard.setStudents(sc);
		standard.displayAll();
		standard.highestPercentage();
		standard.highestMath();
	}
}