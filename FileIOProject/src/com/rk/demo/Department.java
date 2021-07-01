package com.rk.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Department {
	private int departmentId;
	private String departmentName;
	private Location location;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Department() {
		
	}
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", location="
				+ location + "]";
	}
//	public void writeObject(ObjectOutputStream oos) throws IOException,ClassNotFoundException {
//			oos.defaultWriteObject();
//			oos.writeObject(location.getLocationId());
//			oos.writeObject(location.getLocationName());
//	}
//	public void readObject(ObjectInputStream ios) throws IOException, ClassNotFoundException{
//			ios.defaultReadObject();
//			location = new Location((int)ios.readObject(),(String)ios.readObject());
//	}
	public Department(int departmentId, String departmentName, Location location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}
}