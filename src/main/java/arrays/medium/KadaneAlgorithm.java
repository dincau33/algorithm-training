package arrays.medium;

public class KadaneAlgorithm {
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
