package arrays.medium;

/*
 * Write a function that takes in a non-empty array of integers and returns the maximum sum that can be obtained by summing up all the numbers in a non-empty subarray of the input array.
 * A subarray must only contain adjacent numbers.
 */
public class KadaneAlgorithm {
	// O(n) time | O(1)
	public static int kadanesAlgorithm(int[] array) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int n : array) {
			max = Math.max(max, sum += n);
			sum = Math.max(sum , 0);
		}
		return max;
	}
}
