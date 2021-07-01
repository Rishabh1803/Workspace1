package com.lms2.bean;

import java.time.LocalDate;
import java.util.List;

public class Transaction {
	private int bookCount;
	private List<Integer> bookId;
	private int employeeId;
	private LocalDate date;
	private String status;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount() {
		bookCount = bookId.size();
	}
	public List<Integer> getBookId() {
		return bookId;
	}
	public void setBookId(List<Integer> bookId) {
		this.bookId = bookId;
	}
	public Transaction(int bookCount, List<Integer> bookId, int employeeId, LocalDate date, String status) {
		super();
		this.bookCount = bookCount;
		this.bookId = bookId;
		this.employeeId = employeeId;
		this.date = date;
		this.status = status;
	}
}