package graph.medium;

/*
 * You are given an array of integers. Each integer represents a jump of its value in the array.
 * For instance, the integer 2 represents a jump of 2 indices forward in the array; the integer -3 represents a jump of 3 indices backward in the array.
 * If a jump spills past the array's bounds, it wraps over to the other side.
 * For instance, a jump of -1 at index 0 brings us to the last index in the array.
 * Similarly, a jump of 1 at the last index in the array brings us to index 0.
 * Write a function that returns a boolean representing whether the jumps in the array form a single cycle.
 * A single cycle occurs if, starting at any index in the array and following the jumps, every element is visited exactly once before landing back on the starting index.
 */
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
