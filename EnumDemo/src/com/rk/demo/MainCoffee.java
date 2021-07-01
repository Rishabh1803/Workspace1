package com.rk.demo;

import java.util.Scanner;

public class MainCoffee {

	public static void main(String[] args) {
		Coffee coffee;
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Latte\n2. Expresso\n3. Mocha\nEnter Your Choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: coffee = Coffee.LATTE;
				break;
		case 2: coffee = Coffee.EXPRESSO;
				break;
		case 3: coffee = Coffee.MOCHA;
				break;
		default: coffee = Coffee.DEFAULT;
		}
		coffee.display();
		sc.close();
	}

}
