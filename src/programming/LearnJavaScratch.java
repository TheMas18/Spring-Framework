package programming;

public class LearnJavaScratch {
//	int i;
//		public void test() {
//			int i=5;
//			System.out.println("Test Method");
//			System.out.println(i);
//			System.out.println(this.i);
//		}
//	public static void main(String[] args) {
//		LearnJavaScratch obj=new LearnJavaScratch();
//		System.out.println("Main Begins");
//		obj.test();
//	
//		System.out.println("Main Ends");
//	}

//	int a=5;
//	{
//		System.out.println("IIB-1");
//	}
//	LearnJavaScratch() {
//		System.out.println("Inside Constructor");
//	}
//	public static void main(String[] args) {
//		System.out.println("Main Begins");
//		LearnJavaScratch ref= new LearnJavaScratch();
//		System.out.println(ref.a);
//		System.out.println("Main Ends");
//	}
	public static void main(String[] args) {
//		A ref = new B();
//		System.out.println(ref.i);
//		B ref1=(B)ref;
//		System.out.println(ref1.i);
		A ref=new B();
		B ref1=(B)ref;
		ref1.demo();
	}

}

class A {
//	int i = 3;
	public void demo() {
		System.out.println("Class A");
	}

}

class B extends A {
//	int i = 5;
	public void demo() {
		System.out.println("Class B");
	}

}
