package arrays.medium;

import java.util.Arrays;

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
