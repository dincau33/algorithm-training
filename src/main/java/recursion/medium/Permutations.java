package recursion.medium;

import java.util.ArrayList;


/*
 * Write a function that takes in an array of unique integers and returns an array of all permutations of those integers.
 * If the input array is empty, your function should return an empty array
 */
public class Permutations {
    // O(n * n!) time | (n * n!) space
    public static ArrayList<ArrayList<Integer>> getPermutations(ArrayList<Integer> array) {
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<ArrayList<Integer>>();
        getPermutations(array, permutations, 0);
        return permutations;
    }

    public static void getPermutations(ArrayList<Integer> array, ArrayList<ArrayList<Integer>> permutations, int pointer) {
        if (array.size() == 0) return;
        if (array.size() - pointer == 1) {
            permutations.add(array);
        } else {
            for (int i = pointer; i < array.size(); i++) {
                ArrayList<Integer> permutedArray = (ArrayList<Integer>) array.clone();
                swap(permutedArray, i, pointer);
                getPermutations(permutedArray, permutations, pointer + 1);
            }
        }
    }

    private static void swap(ArrayList<Integer> array, int idx1, int idx2) {
        int tmp = array.get(idx1);
        array.set(idx1, array.get(idx2));
        array.set(idx2, tmp);
    }
}
