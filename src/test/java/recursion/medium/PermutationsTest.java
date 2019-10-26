package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    @Test
    public void TestCase1() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> perms = Permutations.getPermutations(input);
        assertTrue(perms.size() == 0);
    }

    @Test
    public void TestCase2() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<ArrayList<Integer>> perms = Permutations.getPermutations(input);
        assertTrue(perms.size() == 1);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1))));
    }

    @Test
    public void TestCase3() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2));
        ArrayList<ArrayList<Integer>> perms = Permutations.getPermutations(input);
        assertTrue(perms.size() == 2);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1))));
    }

    @Test
    public void TestCase4() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<ArrayList<Integer>> perms = Permutations.getPermutations(input);
        assertTrue(perms.size() == 6);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1))));
    }

    @Test
    public void TestCase5() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        ArrayList<ArrayList<Integer>> perms = Permutations.getPermutations(input);
        assertTrue(perms.size() == 24);
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 2, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 4, 3, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 3, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 1, 4, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 1, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 3, 4, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 4, 1, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(2, 4, 3, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 2, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 1, 4, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 1, 4))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 2, 4, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 4, 1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(3, 4, 2, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 1, 2, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 1, 3, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 2, 1, 3))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 2, 3, 1))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 3, 1, 2))));
        assertTrue(contains(perms, new ArrayList<Integer>(Arrays.asList(4, 3, 2, 1))));
    }

    public boolean contains(ArrayList<ArrayList<Integer>> arr1, ArrayList<Integer> arr2) {
        for (ArrayList<Integer> subArray : arr1) {
            if (subArray.equals(arr2)) {
                return true;
            }
        }
        return false;
    }
}