package arrays.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Write a function that takes in an array of integers and returns an array of length2 representing the largest range of numbers contained in that array.
 * The first number in the output array should be the first number in the range while the second number should be the last number in the range.
 * A range of numbers is defines as a set of numbers that come right after each other in the set of real integers.
 * For instance, the output array [2. 6] represents the range {2, 3, 4, 5, 6}, which is a range of length 5.
 * Note that numbers do not need to be ordered or adjacent in the array in order to form a range.
 * Assume that there will only be one largest range
 */
public class LargestRange {
    // Solution 1 - Complexity: O(n) time | O(n) space
    public static int[] largestRange(int[] array) {
        if (array.length == 0) return new int[]{};

        Map<Integer, Boolean> visitedInteger = preloadVisitedInteger(array);
        int[] largestRange = new int[]{array[0], array[0]};

        for (int num:array) {
            int currentMin = num;
            int currentMax = num;
            while (visitedInteger.containsKey(currentMin - 1) && visitedInteger.get(currentMin - 1)) {
                currentMin--;
                visitedInteger.replace(num, false);
            }
            while (visitedInteger.containsKey(currentMax + 1) && visitedInteger.get(currentMax + 1)) {
                currentMax++;
                visitedInteger.replace(currentMax, false);
            }
            largestRange = maxRange(largestRange, new int[]{currentMin, currentMax});
        }

        return largestRange;
    }

    private static Map<Integer, Boolean> preloadVisitedInteger(int[] array) {
        Map<Integer, Boolean> visitedInteger = new HashMap<>();
        for(int num:array) visitedInteger.put(num, true);
        return visitedInteger;
    }

    // Solution 2 - Complexity: O(n * log(n)) time | O(1) space
    public static int[] largestRange2(int[] array) {
        if (array.length == 0) return new int[]{};

        Arrays.sort(array);
        int[] largestRange = new int[]{array[0], array[0]};
        int currentMin = array[0];
        int currentMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] != currentMax && array[i] != currentMax + 1) currentMin = array[i];
            currentMax = array[i];
            largestRange = maxRange(largestRange, new int[]{currentMin, currentMax});
        }

        return largestRange;
    }

    private static int[] maxRange(int[] range1, int[] range2) {
        return (range1[1] - range1[0]) >= (range2[1] - range2[0]) ? range1 : range2;
    }
}
