package LeetCode;

public class Solution {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 8 };
		 int low=0;//0
		 int high=nums.length-1;//6
		 int mid=(high+low)/2;//3
		 int search=9;
		 for (int i = 0; i < nums.length; i++) {
			if(search==nums[mid]) {
				System.out.println("Element is found at : " +i);
				break;
			}
			else if(search<nums[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			mid=(high+low)/2;
		}
	}

	
}
