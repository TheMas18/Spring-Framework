package Practice;

//1
//13
//135
//1357
//13579
public class Demo {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			int n=1;
			for(int j=1;j<i;j++) {
				if(n%2 !=0) {
					System.out.print(n);
				}
				n+=2;
			}
			
			System.out.println();
		}
	}
}
