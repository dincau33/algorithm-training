package dynamicprogramming.medium;

public class NumberOfWaysToMakeChange {
	public static int numberOfWaysToMakeChange(int n, int[] denoms) {
		return numberOfWaysToMakeChange(n, denoms, 0);
	}

	// O(n * d) | O(d) => d number of denonms; n sum
	private static int numberOfWaysToMakeChange(int n, int[] denoms, int d) {
		if (n == 0) return 1;
		int ways = 0;
		if (d < denoms.length) {
			ways += numberOfWaysToMakeChange(n, denoms, d + 1);
			while (n > 0) {
				n -= denoms[d];
				if (n == 0) ways++;
				else if (n > 0) ways += numberOfWaysToMakeChange(n, denoms, d + 1);
			}
		}
		return ways;
	}
}
