package Practice;

import java.util.Scanner;



class P5{
	public static void main(String args[]){	
	Scanner sc=new Scanner(System.in);
	int m[][]=new int[4][4];
	for(int i=0;i<m.length;i++){//0
		int sum=0;//
		for(int j=0;j<m.length;j++){//0123
			if(j<3){
				m[i][j]=sc.nextInt();//123
				sum=sum+m[i][j];//6
			}
			else{
				 m[i][j]=sum;//6
			}
							
		}	
	}

}
}
