package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;

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
