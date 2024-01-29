package OopsConcepts;

import java.util.Scanner;

class Employee{
	private int  id;
	private String fname;
	private String lname;
	private double password;
	private double sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

public class encapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		System.out.print("Enter Id" + "         " + ":-");
		e1.setId(sc.nextInt());
		System.out.print("Enter first Name" + ":-");
		e1.setFname(sc.next());
		System.out.print("Enter Last Name" + "  " + ":-");
		e1.setLname(sc.next());
		System.out.print("Enter Password" + "   " + ":-");
		e1.setPassword(sc.nextDouble());
		System.out.print("Enter Salary" + "     " + ":-");
		e1.setSal(sc.nextDouble());

		System.out.println(e1.getId() + " " + e1.getFname() + e1.getLname() + " s" + e1.getSal());
		sc.close();
}
}
