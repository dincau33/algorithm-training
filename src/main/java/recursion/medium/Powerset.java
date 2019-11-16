package recursion.medium;

import java.util.ArrayList;

/*
 * Write a function that takes in an array of unique integers and returns its powerset. The powerser P(X) of a set X is the set of all subsetss of X. For example, the powerset of [1, 2] is [[],[1],[2],[1,2]]. Note that the sets in the powerset do not need to be in any particular order.
 */
public class Powerset {
    // O(n * 2 ^ n) time | O(n * 2 ^ n) space
    public static ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> array) {
        return powerset(array, array.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> array, int index) {

        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        if (index < 0) {
            subsets.add(new ArrayList<>());
            return subsets;
        }

        subsets = powerset(array, index - 1);
        int element = array.get(index);
        int subsetsSize = subsets.size();
        for (int i = 0; i < subsetsSize; i++) {
            ArrayList<Integer> currentSubset = new ArrayList<>(subsets.get(i));
            currentSubset.add(element);
            subsets.add(currentSubset);
        }

        return subsets;
    }

    public static ArrayList<ArrayList<Integer>> powersetIterative(ArrayList<Integer> array) {

        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for (int element : array) {
            int subsetsSize = subsets.size();
            for (int i = 0; i < subsetsSize; i++) {
                ArrayList<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(element);
                subsets.add(currentSubset);
            }
        }

        return subsets;
    }
}
