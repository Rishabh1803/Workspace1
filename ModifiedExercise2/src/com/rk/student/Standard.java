package com.rk.student;

import java.util.Scanner;

public class Standard {
	private Student[] students;
	private double[] percentage;
	
	public Standard(int n) {
		students = new Student[n];
		percentage = new double[n];
	}

	public void setStudents(Scanner sc) {
		System.out.println("Enter details of all students\n");
		for(int i = 0 ; i<students.length; i++) {
			System.out.println("Enter name and marks in English, Maths and Science: ");
			sc.nextLine();
			String name = sc.nextLine();
			int marksE = sc.nextInt();
			int marksM = sc.nextInt();
			int marksS = sc.nextInt();
			setParticularStudent(i,name,marksE,marksM,marksS);
		}
	}
	
	private void setPercentage() {
		for(int i = 0; i<percentage.length ; i++) {
			percentage[i] = (students[i].getMarksInEng() + students[i].getMarksInMaths() + students[i].getMarksInScience())/3;
		}
	}
	
	private void setParticularStudent(int i, String name, int marksEng, int marksMath, int marksSci) {
		students[i] = new Student(marksEng, marksMath, marksSci, name, i+1);
	}
	
	public void displayAll() {
		System.out.println("All students details: ");
		for(int i = 0 ; i<students.length ; i++) {
			System.out.println(students[i].getRollNo() + "\t" + students[i].getStudName());
		}
	}
	
	public void highestPercentage() {
		int a = 0;
		setPercentage();
		for(int i = 1; i<percentage.length ; i++) {
			if(percentage[i] > percentage[a])
				a = i;
		}
		System.out.println("Student with highest percentage: ");
		System.out.println(students[a].getRollNo() + "\t" + students[a].getStudName());
	}
	
	public void highestMath() {
		int a = 0;
		for(int i = 1; i<students.length ; i++) {
			if(students[i].getMarksInMaths() > students[a].getMarksInMaths())
				a = i;
		}
		System.out.println("Student with highest marks in Mathematics: ");
		System.out.println(students[a].getRollNo() + "\t" + students[a].getStudName());
	}
}