package arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
	// Average: O(n) time | O(n) space
	public static int[] twoNumberSum(int[] array, int targetSum) {

		int[] numbers = {};
		Set<Integer> set = convertToSet(array);

		// for each number check if targetSum-nb is in set
		for (int first : array) {
			int second = targetSum - first;
			if (set.contains(second) && first != second) {
				numbers = first <= second ?
						new int[]{first, second} :
						new int[]{second, first};
				break;
			}
		}

		return numbers;
	}

	private static Set<Integer> convertToSet(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int n : array) {
			set.add(n);
		}
		return set;
	}

}
