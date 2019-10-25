package recursion.easy;

/*
 * The Fibonacci sequence is defined as follows: the first number of the sequence if 0, the second number is 1, and the nth number is the sum of the (n - 1)th and (n - 2)th numbers. Write a function that takes in an integer n and returns the nth Fibonacci number.
 */
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

    // O(n) time | O(1) space
    public static int getNthFibBottomUp(int n) {
        if (n == 1) return 0;
        int resultMinus = 0;
        int result = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = result;
            result = result + resultMinus;
            resultMinus = tmp;
        }
        return result;
    }
}
