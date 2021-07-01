package com.rk.demothread;

class ThirdThread extends Thread{
	
	public ThirdThread() {
//		super();
	}
	public ThirdThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyThirdThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//New Born
		ThirdThread thread1=new ThirdThread(); 
		ThirdThread thread2=new ThirdThread(); 
		ThirdThread thread3=new ThirdThread(); 
		ThirdThread thread4=new ThirdThread(); 
		ThirdThread thread5=new ThirdThread(); 
		
		
		//thread moves from new born state -> ready or running
		thread1.start();
		
		thread2.start();
		
		thread3.start();
		
		thread4.start();
		
		thread5.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		thread5.join();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}

		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}