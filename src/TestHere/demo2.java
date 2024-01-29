package TestHere;


import java.util.*;
class Solution {
    public long maxOutput(int n, int[][] edges, int[] price) {
        int sum=0;
    	
        for(int i=0;i<=n;i++) {
        	sum=sum+price[i];
        }
        return sum;
    }
}
public class demo2 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]edges=new int [n-1] [n-1];
        int []price=new int[n];
   
        
        Solution sl=new Solution();
        
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<edges.length;j++){
             edges[i][j]=sc.nextInt();
       }
       }
        for(int i=0;i<price.length;i++){
            price[i]=sc.nextInt();
        }
        sl.maxOutput(n,edges,price);
      
        sc.close();


    }
}