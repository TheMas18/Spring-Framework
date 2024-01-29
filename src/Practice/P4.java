package Practice;

import java.util.Scanner;

/*Serialization is the process of converting an 
object into a format that can be easily saved to a file or sent over a network. 
Think of it as turning an object into a string of bytes.

class Person {
    String name;
    int age;

}
When you serialize this object, it means you're turning it into a format that can be saved or sent. However, there might be some data in the object that you don't want to save or send. That's where the transient keyword comes in.

For example:

class Person {
    String name;
    transient int age; // This field is marked as transient
    
    // Constructor and other methods...
}
With age marked as transient, it tells Java to exclude this 
field when saving or sending the object. So, when you deserialize
 (convert it back into an object) after serialization, the age field
  will be set to its default value (which is 0 for an int).

In simple terms, transient is like saying, "Don't save or send
 this particular piece of data when you're saving or sending the object." 
 It's a way to control what gets included and what doesn't when working with serialized objects.
*/
//00 01 02
//10 11 12
//20 21 22
public class P4 {
	public static void main(String[] args) {
	
//		Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            String spaces = " ".repeat(n - i);
//            String hashes = "#".repeat(i);
//            System.out.println(spaces + hashes);
//        }
		
		int n=5;
      for (int i = 1; i <= n; i++) {
      String spaces = "_".repeat(n+i);
      String hashes = "#".repeat(n);
      System.out.println(spaces + hashes);
  }

	}
}
