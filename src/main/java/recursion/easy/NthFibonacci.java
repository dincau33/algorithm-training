package recursion.easy;

public class NthFibonacci {
	// O(2^n) time | O(n) space
	public static int getNthFib(int n) {
		if (n == 1) return 0;
		if (n == 2) return 1;
		return getNthFib(n - 1) + getNthFib(n - 2);
	}

	public static int getNthFibMemo(int n) {
		return getNthFibMemo(n, new int[n + 1]);
	}

	// O(n) time | O(n) space
	public static int getNthFibMemo(int n, int[] memo) {
		if (n == 1) return 0;
		if (n == 2) return 1;
		if (memo[n] > 0) return memo[n];
		memo[n] = getNthFibMemo(n - 2, memo) + getNthFibMemo(n - 1, memo);
		return memo[n];
	}
	
}
