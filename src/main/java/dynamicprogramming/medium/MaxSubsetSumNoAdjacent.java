package dynamicprogramming.medium;

/*
 * Write a function that takes in an array of positive integers and returns and integer representing the maximum sum of non-adjacent elements in the array.
 * If a sum cannot be generated, the function should return 0.
 */
public class MaxSubsetSumNoAdjacent {
    // O(n) time | O(n) space
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int[] max = array.clone();
        for (int i = 2; i < array.length; i++) {
            if (i == 2) max[2] = max[0] + array[2];
            else max[i] = Math.max(array[i] + max[i - 2], array[i] + max[i - 3]);
        }
        return Math.max(max[array.length - 1], max[array.length - 2]);
    }
}
