package arrays.medium;

/*
 * Sum of Intervals

 * Write a function called sumIntervals/sum_intervals() that accepts an array of intervals, and returns the sum of all the interval lengths. Overlapping intervals should only be counted once.

 * Intervals are represented by a pair of integers in the form of an array. The first value of the interval will always be less than the second value. Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.
 * List containing overlapping intervals: [[1,4], [7, 10], [3, 5]]
 * The sum of the lengths of these intervals is 7. Since [1, 4] and [3, 5] overlap, we can treat the interval as [1, 5], which has a length of 4.
 */
public class SumOfIntervals {
	public static int sumIntervals(int[][] intervals) {
		int sum = 0;
		if (intervals == null) return sum;

		sortIntervals(intervals);
		int currentMaxRightBand = Integer.MIN_VALUE;
		for (int[] interval:intervals) {
			if (currentMaxRightBand <= interval[0]) {
				sum += interval[1] - interval[0];
				currentMaxRightBand = interval[1];
			}
			else if (currentMaxRightBand < interval[1]) {
				sum += interval[1] - currentMaxRightBand;
				currentMaxRightBand = interval[1];
			}
		}
		return sum;
	}

	private static void sortIntervals(int[][] intervals) {
		for (int i = 0; i < intervals.length - 1; i++) {
			swap(intervals, i, findMinIdx(intervals, i));
		}
	}

	private static int findMinIdx(int[][] intervals, int start) {
		int minIndex = start;
		for (int i = start + 1; i < intervals.length; i++) {
			if (intervals[i][0] < intervals[minIndex][0]) minIndex = i;
			else if (intervals[i][0] == intervals[minIndex][0]) {
				if (intervals[i][1] < intervals[minIndex][1]) minIndex = i;
			}
		}
		return minIndex;
	}

	private static void swap(int[][] array, int i, int j) {
		int tmp[] = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
