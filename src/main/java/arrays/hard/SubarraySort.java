package arrays.hard;

/*
 * Write a function that takes in an array of integers of length a least 2.
 * The function should return an array of the starting and ending indices of the smallest subarray in the input array to be sorted.
 * If the input array is already sorted, the function should return [-1, -1]
 */
public class SubarraySort {
	public static int[] subarraySort(int[] array) {
		int i = 0;
		int j = array.length - 1;
		// Check whether the array is sorted
		while (i < array.length -1 && array[i] <= array[i + 1]) i++;
		while (j > 0 && array[j - 1] <= array[j]) j--;

		if (i > j) return new int[]{-1, -1};

		int left = i;
		int right = j;
		int smallest = array[i + 1];
		int largest = array[j - 1];
		// Find smallest and largest number out of place
		while (i < array.length) smallest = Math.min(smallest, array[i++]);
		while (j >= 0) largest = Math.max(largest, array[j--]);
		// Find where smallest an largest number should be positioned
		while (left > 0 && array[left - 1] > smallest) left--;
		while (right < array.length - 1 && array[right + 1] < largest) right++;

		return new int[]{left, right};
	}
}
