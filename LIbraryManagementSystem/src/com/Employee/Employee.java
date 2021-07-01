package com.Employee;
import java.time.LocalDate;

import com.Book.*;
public class Employee {
	public String name;
	public LocalDate issueDate;
	public Book book;
	public Employee()
	{
		
	}
public Employee(String name, LocalDate date,Book book)
{
	this.name=name;
	this.issueDate=date;
	this.book=book;
}
public String getName()
{
	return name;
}
}
