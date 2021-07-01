package com.Client;
import java.util.*;

import com.Presentation.Presentation;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String b="";
	Presentation p=new Presentation();
	while(true)
	{
	p.Menu();
	int choice=s.nextInt();
	if(choice!=3) {System.out.println("Enter you name:");
	 b=s.next();}
	p.performMenu(choice,b);
	}
	}
}
