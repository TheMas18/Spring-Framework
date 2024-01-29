package Array;

//Spiral order traversal
public class ArraySpiralTraversal {
	public static void main(String[] args) {
		int[][] matrix = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } };

		int rows = matrix.length;//4		
		int cols = matrix[0].length;//4
	     
		int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

		while (top <= bottom && left <= right) {//0<=3 && 0<=3
			// Traverse top row
			for (int i = left; i <= right; i++) {// 0<=3
				System.out.print(matrix[top][i] + " ");//1234
			}
			top++;//1

			// Traverse right column
			for (int i = top; i <= bottom; i++) {//1<=3
				System.out.print(matrix[i][right] + " ");//1 2 3 4 8 12 16 
			}
			right--;//2

			// Traverse bottom row
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;//2
			}
			//1 2 3 4 8 12 16 15 14 13
			
			// Traverse left column
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
			}
		}
	}
}
