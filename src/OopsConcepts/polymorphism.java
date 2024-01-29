package OopsConcepts;

// 1)Compile time polymorphism

//variable shadowing
//class A1{
//	int i =5;
//}
//class A2 extends A1{
//	int i=10;
//}
//public class polymorphism {
//	public static void main(String[] args) {
//
//	A1 ref1=new A2();
//	System.out.println(ref1.i);
//	}
//}

//method shadowing

//class A1 {
//	static void A() {
//		System.out.println("class A1");
//	}
//
//}
//
//class A2 extends A1 {
//	static void A() {
//		System.out.println("class A2");
//	}
//}
//
//public class polymorphism {
//	public static void main(String[] args) {
//
//		A1 ref1 = new A1();
//		ref1.A();
//	}
//}

//1)Compile time polymorphism

//method overriding
//class A1 {
//	public void A() {
//		System.out.println("Class A1");
//	}
//
//}
//
//class A2 extends A1 {
//	public void A() {
//		System.out.println("Class A2");
//	}
//
//}
//
//public class polymorphism {
//	public static void main(String[] args) {
//		A1 ref = new A1();
//		ref.A();
//	}
//}