package Array;

public class A8 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,4,5,5};
	for (int i = 0; i < a.length; i++) {
		
		for (int k =i+1; k < a.length; k++) {
			
		
		if(a[i]==a[k]) {
			System.out.println(a[i]);
		}}
	}
}
}
