package recursion.medium;

import java.util.ArrayList;

/*
 * Write a function that takes in an array of unique integers and returns its powerset. The powerser P(X) of a set X is the set of all subsets of X. For example, the powerset of [1, 2] is [[],[1],[2],[1,2]]. Note that the sets in the powerset do not need to be in any particular order.
 */
public class Powerset {
    public static ArrayList<ArrayList<Integer>> powerset(ArrayList<Integer> array) {

        ArrayList<ArrayList<Integer>> subset = new ArrayList<>();
        subset.add(new ArrayList<>());

        for (int element : array) {
            int subsetSize = subset.size();
            for (int i = 0; i < subsetSize;i++){
                ArrayList<Integer> currentSubset = new ArrayList<>(subset.get(i));
                currentSubset.add(element);
                subset.add(currentSubset);
            }
        }

        return subset;
    }
}
