package arrays.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * If any two numbers in the input array sump up to the target sum, the function should return them in an array, in sorted order.
 * If no two numbers sum up to the target sum, the function should return an empty array.
 * Assume that there will be at most one pair of numbers summing up to the target sum.
 */

public class TwoNumberSum {
    // Average: O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] numbers = {};
        Set<Integer> set = new HashSet<>();

        for (int first : array) {
            int second = targetSum - first;
            if (set.contains(second)) {
                numbers = first <= second ?
                        new int[]{first, second} :
                        new int[]{second, first};
                set.remove(second);
                break;
            } else set.add(first);
        }

        return numbers;
    }
}
