package dynamicprogramming.medium;

/*
 * Given array of positive integers representing coin denominations and a single non-negative integer representing a target amount of money, implement a function that returns the smallest number of coins needed to make change for that target amount using the given coin denomination.
 * Note that an unlimited amount of coins is at your disposal.
 * If it is impossible to make change for the target amount, return -1.
 */
public class MinNumberOfWaysToMakeChange {
	// O(n*d) time | O(n) : d is number of denominations and n is the target amount of money
	public static int minNumberOfCoinsForChange(int n, int[] denoms) {
		int[] smallest = new int[n + 1];
		for (int i = 1; i < smallest.length; i++) smallest[i] = Integer.MAX_VALUE;
		for (int denom : denoms) {
			for (int amount = 1; amount < smallest.length; amount++) {
				if (denom <= amount) {
					int tmp = 0;
					if (smallest[amount - denom] == Integer.MAX_VALUE) tmp = smallest[amount - denom];
					else tmp = smallest[amount - denom] + 1;
					smallest[amount] = Math.min(tmp, smallest[amount]);
				}
			}
		}
		return smallest[n] < Integer.MAX_VALUE ? smallest[n] : -1;
	}
}
