package ObjectClass;

class student1 {
	int rollno;
	String name;
	double marks;

	public student1(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public boolean equals(Object o) {
		student1 s = (student1) o;
		return this.rollno == s.rollno && this.name == s.name && this.marks == s.marks;
	}
}
public class equals_method {
	public static void main(String[] args) {
		student1 s1 = new student1(1, "mayuresh", 32);
		System.out.println(s1);
		student1 s2 = new student1(1, "mayuresh", 32);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
