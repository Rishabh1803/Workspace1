package com.rk.popcorn;

interface ShowType{
	void show();
}
public class MyFirstDemoClass {

	public static void main(String[] args) {
		
		ShowType var=()->{
			System.out.println("Hello everyone!");
		};
		ShowType var1 = ()->{
			System.out.println("Hello JAVA!");
		};
		
		var.show();
		var1.show();

	}

}