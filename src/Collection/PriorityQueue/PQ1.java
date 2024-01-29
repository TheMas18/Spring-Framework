package Collection.PriorityQueue;


import java.util.*;

public class PQ1 {
	public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		pq.add(10);
//		pq.add(20);
//		pq.add(1);
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.peek());

//HR-Q1
//		Scanner sc = new Scanner(System.in);
//		int a[] = new int[3];
//		int b[] = new int[3];
//		for (int i = 0; i < a.length; i++) {
//			int n1 = sc.nextInt();
//
//			if (n1 >= 1 && n1 <= 100) {
//				a[i] = n1;
//			} else {
//				break;
//			}
//
//		}
//		for (int i = 0; i < b.length; i++) {
//
//			int n2 = sc.nextInt();
//			if (n2 >= 1 && n2 <= 100) {
//				b[i] = n2;
//			} else {
//				break;
//			}
//
//		}
//		int alice=0;
//		int bob=0;
//		for (int i = 0; i < b.length; i++) {
//			if(a[i]>b[i]) {
//				alice++;
//				System.out.print(alice);
//			}
//			else if(a[i]<b[i]) {
//				bob++;
//				System.out.print(bob);
//			}
//			
//		}

//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		int count=1;
//		if (s.length()>=1 && s.length()<=Math.pow(10, 5)) {
//			for(char c:s.toCharArray()) {
//				if (Character.isUpperCase(c)) {
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
		String number = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_character = "!@#$%^&*()-+";

		Set<Character> numbers = new HashSet<>();
		Set<Character> lowerCase = new HashSet<>();
		Set<Character> upperCase = new HashSet<>();
		Set<Character> specialCharacters = new HashSet<>();

		for (char c : number.toCharArray()) {
			numbers.add(c);
		}
		for (char c : lower_case.toCharArray()) {
			lowerCase.add(c);
		}
		for (char c : upper_case.toCharArray()) {
			upperCase.add(c);
		}
		for (char c : special_character.toCharArray()) {
			specialCharacters.add(c);
		}
		boolean hasDigit = false;
		boolean hasLower = false;
		boolean hasUpper = false;
		boolean hasSpecial = false;

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		if (length >= 1 && length <= 100) {
			String password = sc.nextLine();
			for (char c : password.toCharArray()) {
				if (numbers.contains(c)) {
					hasDigit=true;
				}
				if (lowerCase.contains(c)) {
					hasLower=true;
				}
				if (upperCase.contains(c)) {
					hasUpper=true;
				}
				if (specialCharacters.contains(c)) {
					hasSpecial=true;
				}
			}
			int missingType=4-(hasDigit?1:0)-(hasUpper?1:0)-(hasLower?1:0)-(hasSpecial?1:0);
			if (length<6) {
				System.out.println(Math.max(6-length,missingType));
			} else {
				System.out.println(missingType);
				
			}
		}
		

	}
}
