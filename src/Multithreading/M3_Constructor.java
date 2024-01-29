package Multithreading;

class MyThr extends Thread {
	public MyThr(String name) {
		super(name);
	}

	public void run() {
		int i=3;
		System.out.println("I am thread");
	}
}

public class M3_Constructor {
	public static void main(String[] args) {

		MyThr t = new MyThr("Mayuresh");
		t.start();
		System.out.println("The id of the thread t is : " + t.getId());
		System.out.println("The name of the thread t is : " + t.getName());
	}

}
