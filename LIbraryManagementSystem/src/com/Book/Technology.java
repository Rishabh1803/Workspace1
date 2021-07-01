package com.Book;

public class Technology extends Book{
	private int lateFee=6;
	@Override
	public void issueDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int lateFee() {
		return this.lateFee;
		
	}

	@Override
	public String toString() {
		return "Technology ";
	}

}
