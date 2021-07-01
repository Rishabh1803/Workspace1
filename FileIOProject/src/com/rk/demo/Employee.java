package com.rk.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private Department department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee() {
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	public void writeObject(ObjectOutputStream oos) throws IOException,ClassNotFoundException {
			oos.defaultWriteObject();
			oos.writeObject(department.getDepartmentId());
			oos.writeObject(department.getDepartmentName());
			oos.writeObject(department.getLocation().getLocationId());
			oos.writeObject(department.getLocation().getLocationName());
	}
	public void readObject(ObjectInputStream ios) throws IOException, ClassNotFoundException{
			ios.defaultReadObject();
			department = new Department((int)ios.readObject(),(String)ios.readObject(),(Location)new Location((int)ios.readObject(),(String)ios.readObject()));
	}
}
