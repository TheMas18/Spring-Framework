package TestHere;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
			for(int i=0;i<5;i++) {
				switch(i++) {
				case 1:
					System.out.println("hello");
					break;
				case 2:
				case 3: 
					System.out.println("world");
					break;
				case 5:
					System.out.println("my");
					break;
				default:
					System.out.println("default");
					break;
				}
				
			}
	}
}
