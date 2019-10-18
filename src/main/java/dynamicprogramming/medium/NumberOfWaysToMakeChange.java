package dynamicprogramming.medium;

public class NumberOfWaysToMakeChange {
	public static int numberOfWaysToMakeChange(int n, int[] denoms) {
		return numberOfWaysToMakeChange(n, denoms, 0);
	}

	private static int numberOfWaysToMakeChange(int n, int[] denoms, int coinIdx) {
		if (n == 0) return 1;
		int ways = 0;
		if (coinIdx < denoms.length) {
			ways += numberOfWaysToMakeChange(n, denoms, coinIdx + 1);
			while (n > 0) {
				n -= denoms[coinIdx];
				if (n == 0) ways++;
				else if (n > 0) ways += numberOfWaysToMakeChange(n, denoms, coinIdx + 1);
			}
		}
		return ways;
	}
}
