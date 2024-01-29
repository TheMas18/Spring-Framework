package Multithreading;

class MyThread1_Runnable implements Runnable {

	public void run() {
		System.out.println("My Thread 1 is Running...");
	}
}

class MyThread2_Runnable implements Runnable {

	public void run() {
		System.out.println("My Thread 2 is Running...");
	}
}

public class M2_Runnable {
	public static void main(String[] args) {
		MyThread1_Runnable bullet1 = new MyThread1_Runnable();
		Thread gun1=new Thread(bullet1);
		MyThread2_Runnable bullet2 = new MyThread2_Runnable();
		Thread gun2=new Thread(bullet2);
		gun1.start();
		gun2.start();
	}
}
