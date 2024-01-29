package Patterns;

public class Pat4 {
	public static void main(String[] args) {
			for(int i=1;i<=4;i++) { //2
				for(int j=1; j<i;j++) {
					System.out.print("_");
				}
				for(int j=i;j<=4;j++) {
					System.out.print(j +" ");
				}
				System.out.println();
			}
	}
}
