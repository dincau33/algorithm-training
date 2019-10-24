package search.easy;

/*
 * Write a function that takes in a sorted array of integers as well as a target integer. The function should use the Binary Search algorithm to find if the target number is contained in the array and should return its index if it is, otherwise, -1
 */
public class BinarySearch {
    // O(log(N)) time | O(log(1)) space
    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array, 0, array.length - 1, target);
    }

    private static int binarySearchHelper(int[] array, int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (target == array[mid]) return mid;
            if (target < array[mid]) return binarySearchHelper(array, left, mid - 1, target);
            return binarySearchHelper(array, mid + 1, right, target);
        }
        return -1;
    }
}
