package Multithreading;
//Q.1) WAP TO PRINT "GOOD MORNING" AND "WELCOME" CONTINUOUSLY ON THE SCREEN IN JAVA USING THREADS.

//class P1 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Good Morning !");
//		}
//	}
//}
//
//class P2 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Welcome !");
//		}
//	}
//}
//
//public class PracticeSet {
//	public static void main(String[] args) {
//		P1 p1 = new P1();
//		P2 p2 = new P2();
//		p1.start();
//		p2.start();
//	}
//
//}

//Q.2) ADD A SLEEP METHOD IN WELCOME THREAD OF QUESTIONS TO DELAY ITS EXECUTION FOR 200MS

//class P1 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Good Morning !");
//		}
//	}
//}
//
//class P2 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Welcome !");
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//public class PracticeSet {
//	public static void main(String[] args) {
//		P1 p1 = new P1();
//		P2 p2 = new P2();
//		p1.start();
//		p2.start();
//	}
//
//}

//Q.3) DEMONSTRATE getPriority() and setPriority() methods in java threads

//class P1 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Good Morning !");
//		}
//	}
//}
//
//class P2 extends Thread {
//	public void run() {
//		while (true) {
//			System.out.println("Welcome !");
//			
//		}
//	}
//}
//
//public class PracticeSet {
//	public static void main(String[] args) {
//		P1 p1 = new P1();
//		P2 p2 = new P2();
//		p1.setPriority(1);
//		p2.setPriority(10);
// 		System.out.println(p1.getPriority());
//		System.out.println(p2.getPriority());
//		p1.start();
//		p2.start();
//	}
//
//}

//Q.4) HOW DO YOU GET STATE OF A GIVEN THREAD IN JAVA?

//class P1 extends Thread {
//	public void run() {
//	
//			System.out.println("Good Morning !");
//
//	}
//}
//
//class P2 extends Thread {
//	public void run() {
//	
//			System.out.println("Welcome !");
//
//	
//	}
//}
//
//public class PracticeSet {
//	public static void main(String[] args) {
//		P1 p1 = new P1();
//		P2 p2 = new P2();
//
//		System.out.println(p2.getState());
//		p1.start();
//		p2.start();
//		System.out.println(p2.getState());
//	}
//
//}

//Q.5) HOW DO YOU GET REFERENCE TO THE CURRENT THREAD IN JAVA?

class P1 extends Thread {
	public void run() {
	
			System.out.println("Good Morning !");

	}
}

class P2 extends Thread {
	public void run() {
	
			System.out.println("Welcome !");

	
	}
}

public class PracticeSet {
	public static void main(String[] args) {
		P1 p1 = new P1();
		P2 p2 = new P2();

	
		p1.start();
		p2.start();
		System.out.println(p2.currentThread());
	}

}
