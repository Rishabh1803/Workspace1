package com.Book;

public class Management extends Book{
	private int lateFee=7;
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
		return "Management ";
	}

}
