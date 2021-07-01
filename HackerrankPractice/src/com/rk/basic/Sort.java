package com.rk.basic;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class SortStudent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student s1) {
		if(o1.getCgpa()>s1.getCgpa()){
			return 1;
		}
		else if(o1.getCgpa() == s1.getCgpa()){
			if(o1.getFname().compareTo(s1.getFname()) > 0){
				return 1;
			}
			else if(o1.getFname().compareTo(s1.getFname()) == 0){
				if(o1.getId() < s1.getId() )
					return 1;
				else
					return -1;
			}
			else
				return -1;
		}
		else
			return -1;
	}	
}

public class Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		studentList.sort(new SortStudent());
		for(Student st: studentList){
			System.out.println(st.getFname());
		}
		in.close();
	}
}