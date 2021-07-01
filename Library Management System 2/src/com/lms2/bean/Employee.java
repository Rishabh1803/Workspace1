package com.lms2.bean;

public class Employee {
	private int employeeId;
	private String employeeName;
//	private List<Integer> BookId;
//	private List<LocalDate> issueDate;
	private int issueCount;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getIssueCount() {
		return issueCount;
	}
	public void setIssueCount(int issueCount) {
		this.issueCount = issueCount;
	}
//	public List<Integer> getBookId() {
//		return BookId;
//	}
//	public void setBookId(List<Integer> bookId) {
//		BookId = bookId;
//	}
//	public List<LocalDate> getIssueDate() {
//		return issueDate;
//	}
//	public void setIssueDate(List<LocalDate> issueDate) {
//		this.issueDate = issueDate;
//	}
	public Employee(int employeeId, String employeeName,/* List<Integer> bookId, List<LocalDate> issueDate,*/
			int issueCount, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
//		BookId = bookId;
//		this.issueDate = issueDate;
		this.issueCount = issueCount;
		this.password = password;
	}
	
}