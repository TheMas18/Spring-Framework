package ObjectClass;

class student2 {
	int rollno;
	String name;
	double marks;

	public student2(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int hashCode() {
		return rollno;
	}
}

public class hashcode_method {
	public static void main(String[] args) {
		student2 s1 = new student2(1, "mayuresh", 32);
		System.out.println(s1);
		student2 s2 = new student2(1, "mayuresh", 32);
		System.out.println(s2);
	
	}
}
