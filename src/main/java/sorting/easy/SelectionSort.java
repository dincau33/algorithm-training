package sorting.easy;

/*
 * Write a function that takes in an array of integers and returns a sorted version of that array. Use the Selection Sort algorithm to sort the array.
 */
public class SelectionSort {
    // O(n^2) time | O(1) space
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findMinIndex(array, i);
            swap(array, i, minIndex);
        }
        return array;
    }

    private static int findMinIndex(int[] array, int start) {
        int minIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
