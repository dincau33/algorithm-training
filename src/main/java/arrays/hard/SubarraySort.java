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
		// If the array is sorted return [-1, -1]
		if (i > j) return new int[]{-1, -1};

		// Find smallest and largest number out of place
		int smallest = array[i + 1];
		int largest = array[j - 1];
		while (i < array.length) smallest = Math.min(smallest, array[i++]);
		while (j >= 0) largest = Math.max(largest, array[j--]);
		
		// Find where smallest an largest number should be positioned
		int leftIdx = 0;
		int rightIdx = array.length - 1;
		while (array[leftIdx] <= smallest) leftIdx++;
		while (array[rightIdx] >= largest) rightIdx--;

		return new int[]{leftIdx, rightIdx};
	}
}
