package Practice;

public class P2 {
	// Methods:- no arg and parameterized methods
	// public static void add() {
	// int a = 10;
	// int b = 20;
	// System.out.println(a + b);
	// }

	// public static int Sub(int a, int b) {

	// return a - b;
	// }

	// public static void main(String[] args) {
	// add();
	// System.out.println(Sub(20, 10));
	// }

	// Method Overloading

	// public static int add(int a, int b) {
	// return a + b;

	// }

	// public static int add(int a, int b, int c) {
	// return a + b + c;
	// }

	// public static int add(int a, int b, int c, int d) {
	// return a + b + c + d;
	// }

	// public static void main(String[] args) {

	// System.out.println(add(5, 5));
	// System.out.println(add(50, 20, 30));
	// System.out.println(add(50, 50, 50, 50));

	// }

	// Print 5 to 1 numbers without loops
	// method recursion
	// public static void demo(int n) {
	// if (n >= 1) {
	// System.out.println(n);
	// n--;
	// demo(n);
	// }

	// }

	// public static void main(String[] args) {
	// demo(5);
	// }

	// non static
	// int i;

	// public void add() {
	// i = 10;
	// System.out.println("hello");
	// }

	// public static void main(String[] args) {
	// System.out.println("Main starts");
	// qspiderT1 obj1 = new qspiderT1();
	// obj1.add();
	// System.out.println("Main Ends");
	// }

	// constructor and constructor Overloading
	// int rollno;
	// String name;
	// double marks;

	// qspiderT1(int rollno) {
	// this.rollno = rollno;

	// }

	// qspiderT1(int rollno, String name) {
	// this.rollno = rollno;
	// this.name = name;

	// }

	// qspiderT1(int rollno, String name, double marks) {
	// this.rollno = rollno;
	// this.name = name;
	// this.marks = marks;
	// }

	// public static void main(String[] args) {
	// qspiderT1 ref1 = new qspiderT1(1);
	// System.out.println(ref1.rollno);
	// qspiderT1 ref2 = new qspiderT1(1, "Mayuresh");
	// System.out.println(ref2.rollno + "" + ref2.name);
	// qspiderT1 ref3 = new qspiderT1(1, "Mayuresh", 100);
	// System.out.println(ref3.rollno + "" + ref3.name + "" + ref3.marks);
	// }

	// Encapsulation

}



//learn Encapsulation

//dataa hiding
//class ATM {
//   private int cash = 10000;

//   public int getCash() {
//       return cash;
//   }

//   public void setCash(int cash) {
//       this.cash = cash;
//   }
//}

//public class qspiderT2 {
//   public static void main(String[] args) {
//       ATM ref = new ATM();
//       System.out.println(ref.getCash());
//       ref.setCash(50000);
//       System.out.println(ref.getCash());
//   }

//data hiding to achieve design flexibility
//class Employee {
//   private int emp_id = 101;
//   private String emp_name = "Mayuresh Samant";
//   private String company_status = "Unemployed";
//   private String cmp_name;

//   // Only readable
//   public int getEp_id() {
//       return emp_id;
//   }

//   public String getEmp_name() {
//       return emp_name;
//   }

//   // Both Readable and writable
//   public String setCompany_status(String cmp_name) {
//       if (this.cmp_name == null) {
//           System.out.println(this.company_status);
//       } else {
//           System.out.println("Employed");
//       }
//       return cmp_name;

//   }

//   public String getCompany_status() {
//       return company_status;
//   }

//   // only writable
//   public String setCmp_name(String cmp_name) {
//       return this.cmp_name = cmp_name;

//   }

//}

//public class qspiderT2 {
//   public static void main(String[] args) {
//       Employee ref = new Employee();
//       System.out.println(ref.getEp_id());
//       System.out.println(ref.getEmp_name());
//       ref.setCmp_name("tcs");

//       System.out.println(ref.getCompany_status());
//   }
//
//public class P2 {
//  public static void main(String[] args) {
//
//  }
//}

