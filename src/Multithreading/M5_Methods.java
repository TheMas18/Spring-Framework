package Multithreading;

class MyNewThr1 extends Thread {

	public void run() {
		while (true) {
			System.out.println("Thank You thread 1");
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyNewThr2 extends Thread {

	public void run() {
		while (true) {
			System.out.println("Thank You thread 2");
		}
	}
}

public class M5_Methods {
	public static void main(String[] args) {
		MyNewThr1 t1 = new MyNewThr1();
		MyNewThr2 t2 = new MyNewThr2();
		t1.start();
//
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
	}
}
