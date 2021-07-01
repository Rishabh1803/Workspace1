package com.lms2.bean;

public class Book {
	private int bookId;
	private String bookName;
	private int stock;
	private int lateFee;
	private static final int issueDuration = 7;
	
	public int getLateFee() {
		return lateFee;
	}
	public void setLateFee(int lateFee) {
		this.lateFee = lateFee;
	}
	public static int getIssueduration() {
		return issueDuration;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getIssueDuration() {
		return issueDuration;
	}
	public Book() {
	}
	public Book(int bookId, String bookName, int stock) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return bookId + ".\t" + bookName;
	}
}