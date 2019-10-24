package arrays.medium;

import java.util.Arrays;

/*
 * Write a function that takes in two non-empty arrays of integers. The function should find the pair of numbers (one from the first array, one from the second array) whose absolute difference is closest to zero.
 * The function should return an array containing these two numbers, with the number from the first array in the first position.
 * Assume that there will only be one pair of numbers with the smallest difference.
 */
public class SmallestDifference {
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
		// 0 - sorted arrays, : O(n*log(n)) | O(1)
		int[] pair = {};
		int currentMin = Integer.MAX_VALUE;

		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		int i = 0;
		int j = 0;

		while (currentMin > 0 && i < arrayOne.length && j < arrayTwo.length) {
			if (Math.abs(arrayOne[i] - arrayTwo[j]) < currentMin) {
				currentMin = Math.abs(arrayOne[i] - arrayTwo[j]);
				pair = new int[] {arrayOne[i], arrayTwo[j]};
			}
			if (arrayOne[i] < arrayTwo[j]) i++; else j++;
		}

		return pair;
	}
}
