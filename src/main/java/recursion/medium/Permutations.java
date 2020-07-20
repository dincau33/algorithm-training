package recursion.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function that takes in an array of unique integers and returns an array of all permutations of those integers.
 * If the input array is empty, your function should return an empty array
 */
public class Permutations {
    // O(n * n!) time | (n * n!) space
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        getPermutations(array, permutations, 0);
        return permutations;
    }

    public static void getPermutations(List<Integer> array, List<List<Integer>> permutations, int pointer) {
        if (array.size() == 0) return;
        if (array.size() - pointer == 1) {
            permutations.add(array);
        } else {
            for (int i = pointer; i < array.size(); i++) {
                List<Integer> permutedArray = new ArrayList<>(array);
                swap(permutedArray, i, pointer);
                getPermutations(permutedArray, permutations, pointer + 1);
            }
        }
    }

    private static void swap(List<Integer> array, int idx1, int idx2) {
        int tmp = array.get(idx1);
        array.set(idx1, array.get(idx2));
        array.set(idx2, tmp);
    }
}
