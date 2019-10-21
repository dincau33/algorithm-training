package graph.medium;

public class SimpleCycleCheck {
	public static boolean hasSingleCycle(int[] array) {
		int numberOfElementsVisited = 0;
		int currentIdx = 0;
		while (numberOfElementsVisited < array.length) {
			if (currentIdx == 0 && numberOfElementsVisited > 0) return false;
			else {
				currentIdx = getNextIdx(currentIdx, array);
				numberOfElementsVisited++;
			}
		}
		return currentIdx == 0;
	}

	private static int getNextIdx(int currentIdx, int[] array) {
		int nextIdx = (currentIdx + array[currentIdx]) % array.length;
		return nextIdx >= 0 ? nextIdx : array.length + nextIdx;
	}
}
