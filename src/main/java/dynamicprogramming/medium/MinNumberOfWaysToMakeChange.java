package dynamicprogramming.medium;

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
