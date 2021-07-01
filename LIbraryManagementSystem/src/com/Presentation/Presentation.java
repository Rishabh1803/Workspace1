package com.Presentation;

import java.util.Scanner;
import java.time.LocalDate;

import com.Book.*;
import com.Database.Details;
import com.Employee.Employee;

public class Presentation {
	Details d=new Details();
	Scanner s=new Scanner(System.in);
public void Menu()
{
	System.out.println("Welcome");
	System.out.println("1.Issue a Book");
	System.out.println("2.Return a Book");
	System.out.println("3.Exit");
	System.out.println("Enter your choice:");
}
public void bookMenu()
{
	System.out.println("Please Select a Book");
	System.out.println("1.Data Analytics");
	System.out.println("2.Technology");
	System.out.println("3.Management");
}
public void performBookMenu(int option,String b)
{

	switch(option)
	{
	case 1:
		d.setData(new Employee(b,LocalDate.now(),new DataAnalytics()));
		break;
	case 2:
		d.setData(new Employee(b,LocalDate.now(),new Technology()));
		break;
	case 3:
		d.setData(new Employee(b,LocalDate.now(),new Management()));
		break;
	}
	System.out.println("your book has been issued");
}
public void performMenu(int choice,String name)
{
	switch(choice)
	{
	case 1:bookMenu();
	int option=s.nextInt();
	performBookMenu(option,name);
	break;
	case 2:
	   if(d.searchBook(name)!=null) {
		   System.out.println("You have issued "+d.searchBook(name).toString()+" book and its issue date is "+d.searchDate(name));
		   int fine=d.CaluculateFine(d.getEmployee(name));
		   if(fine>0)
		   {
		   System.out.println("You have to pay the Fine amount of "+fine);
		   }
		   else
		   {
			   System.out.println("You have returned the book on time\nThank you!!");
		   }
	       d.removeData(name);
	   }
	   else 
		   System.out.println("You havenot isssued any book");
	   break;
	case 3:
		System.out.println("Thanks for using Library Management System!!!");
		System.exit(0);
	default :
		System.out.println("Invalid Choice");
	}
}
}