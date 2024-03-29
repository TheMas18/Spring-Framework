package HackerRank;

import java.util.List;

public class FlippingMatrix {
	public static int flippingMatrix(List<List<Integer>> matrix) {
		int n = matrix.size() / 2; // n x n quadrant

		int maxSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Find maximum value for each cell in the upper-left quadrant
				int maxVal = Math.max(matrix.get(i).get(j), Math.max(matrix.get(i).get(2 * n - j - 1),
						Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1))));
				maxSum += maxVal;
			}
		}

		return maxSum;

	}

	public static void main(String[] args) {
		// Example usage:
		List<List<Integer>> exampleMatrix = List.of(List.of(112, 42, 83, 119), List.of(56, 125, 56, 49),
				List.of(15, 78, 101, 43), List.of(62, 98, 114, 108));

		// Calculate and print the result for the provided matrix
		int result = flippingMatrix(exampleMatrix);
		System.out.println(result);
	}
}

/*
 * 
 * Sean invented a game involving a matrix where each cell of the matrix
 * contains an integer. He can reverse any of its rows or columns any number of
 * times. The goal of the game is to maximize the sum of the elements in the
 * submatrix located in the upper-left quadrant of the matrix.
 * 
 * Given the initial configurations for matrices, help Sean reverse the rows and
 * columns of each matrix in the best possible way so that the sum of the
 * elements in the matrix's upper-left quadrant is maximal.
 * 
 * Example
 * 
 * 1 2 3 4 It is and we want to maximize the top left quadrant, a matrix.
 * Reverse row :
 * 
 * 1 2 4 3 And now reverse column :
 * 
 * 4 2 1 3 The maximal sum is .
 * 
 * Function Description
 * 
 * Complete the flippingMatrix function in the editor below.
 * 
 * flippingMatrix has the following parameters: - int matrix[2n][2n]: a
 * 2-dimensional array of integers
 * 
 * Returns - int: the maximum sum possible.
 * 
 * Input Format
 * 
 * The first line contains an integer , the number of queries.
 * 
 * The next sets of lines are in the following format:
 * 
 * The first line of each query contains an integer, . Each of the next lines
 * contains space-separated integers in row of the matrix. Constraints
 * 
 * , where . Sample Input
 * 
 * STDIN Function ----- -------- 1 q = 1 2 n = 2 112 42 83 119 matrix = [[112,
 * 42, 83, 119], [56, 125, 56, 49], \ 56 125 56 49 [15, 78, 101, 43], [62, 98,
 * 114, 108]] 15 78 101 43 62 98 114 108 Sample Output
 * 
 * 414 Explanation
 * 
 * Start out with the following matrix:
 * 
 * Perform the following operations to maximize the sum of the submatrix in the
 * upper-left quadrant:
 * 
 * Reverse column (), resulting in the matrix: Reverse row (), resulting in the
 * matrix: The sum of values in the submatrix in the upper-left quadrant is .
 */