package sorting.easy;

/*
 * Write a function that takes in an array of integers and returns a sorted version of that array. Use the Buble Sort algorithm to sort the array.
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        // Worst: O(n^2) time | O(1) space
        // Average: O(n^2) time | O(1) space
        // Best: O(n) time | O(1) space
        boolean isSorted = true;
        while (true) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array [i+1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
            if (!isSorted) isSorted = true; else break;
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array [j];
        array[j] = tmp;
    }
}
