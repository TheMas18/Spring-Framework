package Multithreading;

class MyThr1 extends Thread {
	public MyThr1(String name) {
		super(name);
	}

	public void run() {

		System.out.println("The name of the thread t is : " + getName());
	}
}

public class M4_Priorities {
	public static void main(String[] args) {
		MyThr1 t1 = new MyThr1("Mayuresh");
		MyThr1 t2 = new MyThr1("Manoj");
		MyThr1 t3 = new MyThr1("Pratham");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(1);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
