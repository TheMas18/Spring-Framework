package ObjectClass;

class student {
	int rollno;
	String name;
	double marks;

	public student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return rollno + " " + name + " " + marks;
	}
//	public String toString() {
//		return "apple";
//	}
}

public class toString_method {
	public static void main(String[] args) {
		student s1 = new student(1, "mayuresh", 32);
		System.out.println(s1);
		student s2 = new student(2, "xyz", 40);
		System.out.println(s2);
	}
}
