package search.easy;

/*
 * Write a function that takes in an array of integers and returns a sorted array of the three largest integers in the input array. Note that the function should return duplicate integers if necessary; for example, it should return [10, 10, 12] for an input array of [10, 5, 9, 10, 12].
 */
public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        // O(n) time | O(1) space
        int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int candidate : array) {
            updateLargestNumbers(largest, candidate);
        }
        return largest;
    }

    private static void updateLargestNumbers(int[] largest, int candidate) {
        for (int j = largest.length - 1; j >= 0; j--) {
            if (candidate > largest[j]) {
                int temp = largest[j];
                largest[j] = candidate;
                candidate = temp;
            }
        }
    }
}
