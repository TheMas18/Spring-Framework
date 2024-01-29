package Array;

public class A9 {
	public static void main(String[] args) {

//		right side 
		int a[]= {1,2,3,4,5};
		//12345
		//
		int n=2;
		for (int i = 0; i < n; i++) {
			int last=a[a.length-1];//5
			for (int j = a.length-1; j >0; j--) {//5
				a[j]=a[j-1];//4
				a[j-1]=last;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		

//		left side
//		int a[]= {1,2,3,4,5};
		//23451
		//2 1 3 4 5
		// 2 3 1 4 5
		// 2 3 4 1 5
		// 2 3 4 5 1
//		int n=1;
//		for (int i = 0; i < n; i++) {
//			int first=a[0];//1
//			for (int j = 0; j <a.length-1; j++) {//3
//				a[j]=a[j+1];
//				a[j+1]=first;
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//	
	}
}
 