package Array;

public class tripplet {
public static void main(String[] args) {
	int a[] = { 6,4,5,2,1,3 };
	
//	
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			for(int k=j+1;k<a.length;k++) {
//				if(a[i]+a[j]+a[k]==10) {
//					System.out.println(a[i] + " " + a[j] +" "+a[ k]);
//				}
//			}
//		}
//}
	int count=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			for(int k=j+1;k<a.length;k++) {
				if(a[i]+a[j]+a[k]==10 ) {
					count++;
					System.out.println(a[i] + " " + a[j] +" "+a[ k]);
				}
			}
			if(count==3) {
				break;
			}
		}
}
//	
//	for(int i=0;i<a.length-2;i++) {
//		for(int j=i+1;j<a.length-1;j++) {
//			for(int k=j+1;k<a.length;k++) {
//				if(a[i]+a[j]+a[k]==10) {
//					System.out.println(a[i] + " " + a[j] +" "+a[ k]);
//				}
//			}
//		}
//}
}}