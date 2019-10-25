package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of all these triplets.
 * The numbers in each triplet should be ordered in ascending order, and the triplets themselves should be ordered in ascending order with respect to the numbers they hold.
 * If no three numbers sum up to the target sum, the function should return an empty an array
 */
public class ThreeNumberSum {
    public static ArrayList<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // 1 - Brute force - 3 for loops
        // 2 - Sorted array - 2 loops
        // 3 - Hash?

        // Average: O(n^2) time | O(n) space
        int n = array.length;
        Arrays.sort(array);
        ArrayList<Integer[]> triplets = new ArrayList<Integer[]>();

        for (int first = 0; first < n - 2; first++) {
            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int currentSum = array[first] + array[second] + array[third];
                if (currentSum == targetSum) {
                    Integer[] triplet = {array[first], array[second], array[third]};
                    triplets.add(triplet);
                    second++;
                    third--;
                } else if (currentSum > targetSum) {
                    third--;
                } else if (currentSum < targetSum) {
                    second++;
                }
            }
        }
        return triplets;
    }
}
