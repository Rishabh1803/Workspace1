package com.rk.student;

public class Student {
	private int MarksInEng, MarksInMaths, MarksInScience, RollNo;
	private String StudName;

	public int getRollNo() {
		return RollNo;
	}

	public int getMarksInEng() {
		return MarksInEng;
	}
	
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	
	public int getMarksInScience() {
		return MarksInScience;
	}
	
	public String getStudName() {
		return StudName;
	}

	public Student(int marksInEng, int marksInMaths, int marksInScience, String studName, int rollNo) {
		MarksInEng = marksInEng;
		MarksInMaths = marksInMaths;
		MarksInScience = marksInScience;
		StudName = studName;
		RollNo = rollNo;
	}
}