package arrays.medium;

import java.util.List;

/*
 * You are given an array of integers and an integer. Write a function that moves all instances of that integer in the array to the end of the array
 * The function should perform this in place and does not need to maintain the order of the other integers.
 */
public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int l = 0;
        int r = array.size() - 1;
        while (l < r) {
            if (array.get(r) == toMove) r--;
            if (array.get(l) == toMove) swap(array, l, r--);
            l++;
        }
        return array;
    }

    public static void swap(List<Integer> array, int i, int j) {
        int tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }
}
