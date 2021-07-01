package com.Book;

public abstract class Book {
	public abstract void issueDate();
	public abstract int lateFee();
}
//period = Period.between(getIssueDate(),getReturnDate()).getDays() - 7;
//return period * getLateFee();