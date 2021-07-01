package com.rk.demothread;

class MySecondThread extends Thread{
	static {
		System.out.println("MySecondThread");
		MySecondThread thread7 = new MySecondThread("Static MySecondThread");
		thread7.start();
	}
	public MySecondThread() {
//		super();
	}
	public MySecondThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MySecondThreadDemo {
	
	static {
		System.out.println("MySecondThreadDemo");
		MySecondThread thread0 = new MySecondThread("Static MySecondThreadDemo");
		thread0.start();
	}
	public static void main(String[] args) {
		
		//New Born
		MySecondThread thread1=new MySecondThread("First Thread"); //Thread-0
		MySecondThread thread2=new MySecondThread("Second Thread"); //SecondThread
		MySecondThread thread3=new MySecondThread("Third Thread"); //Thread-1
		MySecondThread thread4=new MySecondThread("Fourth Thread"); //Thread-2
		MySecondThread thread5=new MySecondThread("Fifth Thread"); //Thread-3
		MySecondThread thread6=new MySecondThread();
		
		
		//thread moves from new born state -> ready or running
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}