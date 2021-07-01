package com.rk.popcorn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Chocolate Popcorn\n2. Caramel Popcorn\n3. Butter Popcorn");
		System.out.println("Enter the type of popcorn: ");
		shop.buy(sc.nextInt());
		sc.close();
	}
}