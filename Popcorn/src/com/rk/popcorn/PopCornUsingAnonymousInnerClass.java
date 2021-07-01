package com.rk.popcorn;

class PopCornDemo{
	public void pop() {
		System.out.println("PopCorn is popping");
	}
}
class CaramelPopCornDemo extends PopCornDemo{
	public void pop() {
		System.out.println("Caramel PopCorn is popping");
	}
	public void quantity() {
		System.out.println("Additing lots of caramel");
	}
}


public class PopCornUsingAnonymousInnerClass {

	
	
	public static void main(String args[]) {
		PopCornDemo p;
//		p=new PopCorn();
//		p.pop();
//		
//		p=new CaramelPopCorn();
//		p.pop();
		
		
		
		//reference variable is of base class=object is of child class (Object slicing)
		p=new CaramelPopCornDemo();
		p.pop();
		((CaramelPopCornDemo)(p)).quantity();//type casting
		
		p=new PopCornDemo() {
			public void pop() {
				System.out.println("Yummy Butter PopCorn is popping");
			}
			@SuppressWarnings("unused")
			public void quantity() {
				System.out.println("Adding lots of Butter");
			}
		};
		
		p.pop();
//		p.quantity(); //undefined for PopCornDemo
		
		
		
	}
}