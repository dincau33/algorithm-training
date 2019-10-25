package heap.medium;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/*
 * Implement a Min Heap class. The class should support insertion, removal (of the minimum / root value), peeking (of the minimum / root value), as well as sifting a value up and own the heap and building a heap from an input array.
 * The heap should be represented in the form an array.
 */
public class MinHeapConstruction {
    static class MinHeap {
        ArrayList<Integer> heap = new ArrayList<Integer>();

        public MinHeap(ArrayList<Integer> array) {
            heap = buildHeap(array);
        }

        // O(n * log (n)) time
        public ArrayList<Integer> buildHeap(ArrayList<Integer> array) {
            for (int value : array) insert(value);
            return heap;
        }

        // O(log (n)) time
        public void siftDown(int currentIdx, int endIdx, ArrayList<Integer> heap) {
            int leftChildIdx = getLeftChildIdx(currentIdx);
            int rightChildIdx = getRightChildIdx(currentIdx);
            while (rightChildIdx <= endIdx && heap.get(currentIdx) > Math.min(heap.get(leftChildIdx), heap.get(rightChildIdx))) {
                int idxToSwap = heap.get(leftChildIdx) < heap.get(rightChildIdx) ? leftChildIdx : rightChildIdx;
                swap(currentIdx, idxToSwap, heap);
                currentIdx = idxToSwap;
                leftChildIdx = getLeftChildIdx(currentIdx);
                rightChildIdx = getRightChildIdx(currentIdx);
            }
        }

        // O(log (n)) time
        public void siftUp(int currentIdx, ArrayList<Integer> heap) {
            int parentIdx = getParentIdx(currentIdx);
            while (parentIdx >= 0 && heap.get(currentIdx) < heap.get(parentIdx)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = getParentIdx(currentIdx);
            }
        }

        // O(1) time
        public int peek() {
            if (heap.isEmpty()) throw new NoSuchElementException();
            return heap.get(0);
        }

        // O(log (n)) time
        public int remove() {
            int valueToRemove = heap.get(0);
            int lastValueIdx = heap.size() - 1;
            heap.set(0, heap.get(lastValueIdx));
            heap.remove(lastValueIdx);
            siftDown(0, lastValueIdx - 1, heap);
            return valueToRemove;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        private void swap(int idx1, int idx2, ArrayList<Integer> heap) {
            int tmp = heap.get(idx2);
            heap.set(idx2, heap.get(idx1));
            heap.set(idx1, tmp);
        }

        private int getParentIdx(int idx) {
            if (idx % 2 == 0) return (idx - 2) / 2;
            else return (idx - 1) / 2;
        }

        private int getLeftChildIdx(int idx) {
            return idx * 2 + 1;
        }

        private int getRightChildIdx(int idx) {
            return idx * 2 + 2;
        }
    }
}
