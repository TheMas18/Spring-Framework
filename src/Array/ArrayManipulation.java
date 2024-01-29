package Array;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Insert an element at a specific position
        int[] newArray = insertElement(array, 2, 10);
        System.out.println("Array after insertion: " + Arrays.toString(newArray));

        // Delete an element from a specific position
        newArray = deleteElement(newArray, 3);
        System.out.println("Array after deletion: " + Arrays.toString(newArray));

        // Update an element at a specific position
        newArray = updateElement(newArray, 1, 8);
        System.out.println("Array after update: " + Arrays.toString(newArray));
    }

    private static int[] insertElement(int[] array, int position, int element) {// 12345
        int length = array.length + 1;
        int[] newArray = new int[length];//1,2,10,

        // Copy elements before the insertion point
        for (int i = 0; i < position; i++) {//01<2
            newArray[i] = array[i];//
        }

        // Insert the new element
        newArray[position] = element;//2

        // Copy elements after the insertion point
        for (int i = position + 1; i < length; i++) {//3
            newArray[i] = array[i - 1];
        }

        return newArray;
    }

    private static int[] deleteElement(int[] array, int position) {//12345 3
        int length = array.length - 1;
        int[] newArray = new int[length];//12

        // Copy elements before the deletion point
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Copy elements after the deletion point
        for (int i = position; i < length; i++) {
            newArray[i] = array[i + 1];
        }

        return newArray;
    }

    private static int[] updateElement(int[] array, int position, int newElement) {
        int[] newArray = array.clone();
        newArray[position] = newElement;
        return newArray;
    }
}