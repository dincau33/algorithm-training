package arrays.hard;

import java.util.*;

/*
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
 * The function should find all quadruplets in the array that sum up to the target sum and return a two-dimensional array of all these quadruplets in no particular order.
 * If no four numbers sum up to the target sum, the function should return an empty array.
 */
public class FourNumberSum {
    // Complexity: O(n^2) time | O(n^2) space
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        Map<Integer, List<Integer[]>> allPairsSum = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if (allPairsSum.containsKey(difference)) {
                    for (Integer[] pair : allPairsSum.get(difference)) {
                        Integer[] quadruplet = {pair[0], pair[1], array[i], array[j]};
                        quadruplets.add(quadruplet);
                    }
                }
            }
            for (int k = 0; k < i; k++) {
                int currentSum = array[i] + array[k];
                Integer[] pair = {array[i], array[k]};
                if(!allPairsSum.containsKey(currentSum)) {
                    List<Integer[]> pairGroup = new ArrayList<Integer[]>();
                    pairGroup.add(pair);
                    allPairsSum.put(currentSum, pairGroup);
                } else allPairsSum.get(currentSum).add(pair);
            }
        }
        return quadruplets;
    }
}
