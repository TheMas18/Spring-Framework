package ExceptionHandling;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if (age<18) {
			throw new InvalidAgeException();
		}
		System.out.println("You are eligible");
		
	}
}
