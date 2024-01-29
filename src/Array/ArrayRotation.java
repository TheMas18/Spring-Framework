package Array;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int positions = 2;

		// Create a temporary array to store rotated elements
		int[] rotatedArray = new int[array.length];//4 5 1 2 3

		// Perform rotation
		for (int i = 0; i < array.length; i++) {//0123
			int newPosition = (i + positions) % array.length;//2
			rotatedArray[newPosition] = array[i];
		}

		// Print the rotated array
		System.out.print("Rotated array: ");
		for (int element : rotatedArray) {
			System.out.print(element + " ");
		}
	}
}
