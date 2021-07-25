package com.rk.client;

import java.util.Scanner;

import com.rk.presentation.EmployeePresentation;
import com.rk.presentation.EmployeePresentationImpl;

public class Main {

	public static void main(String[] args) {
		EmployeePresentation presentation = new EmployeePresentationImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			presentation.showMenu();
			System.out.println();
			presentation.selectOption(sc.nextInt());
			System.out.println();
		}

	}

}
