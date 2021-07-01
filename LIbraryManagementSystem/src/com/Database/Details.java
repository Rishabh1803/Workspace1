package com.Database;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

import com.Book.Book;
import com.Employee.Employee;
public class Details {
HashSet <Employee> Data=new HashSet<>();
public void setData(Employee em)
{
	Data.add(em);	
}
public Book searchBook(String name) {
	 for (Employee e : Data)
	 {
		 if(e.getName().equals(name))
		 {
			 return e.book;
		 }
	 }
	 return null;      
}
public Employee getEmployee(String name)
{
	for(Employee e:Data)
	{
		if(e.getName().equals(name))
		{
			return e;
		}
	}
	return new Employee();
}
public int CaluculateFine(Employee e)
{
	int period = Period.between(e.issueDate,LocalDate.now()).getDays() ;
	return period * (e.book.lateFee());
}
public LocalDate searchDate(String name)
{
for(Employee e:Data)
{
	if(e.getName().equals(name))
	{
		return e.issueDate;
	}
}
return null;
}
public void removeData(String name)
{

    Iterator value =Data.iterator();
    while (value.hasNext()) {
    	if(value.next().equals(name))
		{
		Data.remove(value.next());
		}
    }
        
}
}
