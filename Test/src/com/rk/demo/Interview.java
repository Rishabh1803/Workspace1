package com.rk.demo;
class A{
	int a = 10;
	public static void m1() {
		System.out.println("A");
	}
}
class B extends A{
	int a = 20;
	public static void m1() {
		System.out.println("B");
	}
}
public class Interview {
//	public void call(long a) {
//		System.out.println("long");
//	}
	public void call(Long a) {
		System.out.println("Long");
	}
	public void call(Object a) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.a);
		obj.m1();
		Interview obj1 = new Interview();
		obj1.call(10);
	}
}