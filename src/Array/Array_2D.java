package Array;

public class Array_2D {

	public static void main(String[] args) {

//		int [][][]a={};
//		System.out.println("a: "+a);

//		int[] a[]= {{}},b= {};
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);

//		int []a[]={{}};
//		System.out.println("a: "+a);

//		int a[][] = { {} };
//		System.out.println("a: " + a);

//		int [][]a={{}},b={{}};
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);

//		int [][]a={{}},[]b={{}};
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);

//		int [][]a={{}},b[]={{}};
//
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);

//		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
//		System.out.println("2d Add: "+a);
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println();

//		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(a[0][0]+ " " +a[0][1]+" " + a[0][2]);
//		System.out.println();
//		System.out.println(a[1][0]+ " " +a[1][1]+" " + a[1][2]);
//		System.out.println();
//		System.out.println(a[2][0]+ " " +a[2][1]+" " + a[2][2]);
//		System.out.println();
		
//		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]a= {{1,2,3,4,5,6},{4,5},{7,8,9,10}};
		System.out.println("By Using loop");
		for (int i = 0; i < a.length; i++) {//outer index
			
			for (int j = 0; j < a[i].length; j++) { //inner index
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}

	}
}
