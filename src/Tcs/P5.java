

package Tcs;

public class P5 {
public static void main(String[] args) {
	int n=1679583;
	int result=additivePersistance(n);
	System.out.println(result);
		
}

public static int sumdigit(int n) {
	int sum=0;
	while(n!=0) {
		int d=n%10;
		sum=sum+d;
		n/=10;
	}
	return sum;
}

public static int additivePersistance(int n) {
	int count=0;
	while(n>9) {
		
		n=sumdigit(n);
		System.out.println(n);
		count++;
	}

	return count;
}
}
