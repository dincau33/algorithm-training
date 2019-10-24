package sorting.easy;

/*
 * Write a function that takes in an array of integers and returns a sorted version of that array. Use the Insertion Sort algorithm to sort the array.
 */
public class InsertionSort {
    // Worst: O(n^2) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Best: O(n) time | O(1) space
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j - 1, j);
                j--;
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
