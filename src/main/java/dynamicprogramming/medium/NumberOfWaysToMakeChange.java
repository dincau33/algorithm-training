package dynamicprogramming.medium;

/*
 * Given an array of positive integers representing coin denominations and a single non-negative integer representing a target amount of money, implement a function that returns the number of ways to make change for that target amount using the give coin denominations.
 * Note that an unlimited amount of coins is at your disposal.
 */
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
