package recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowersetTest {
    @Test
    public void TestCase1() {
        List<List<Integer>> output = Powerset.powerset(new ArrayList<Integer>());
        assertTrue(output.size() == 1);
        assertTrue(contains(output, new int[] {}));
    }

    @Test
    public void TestCase2() {
        List<List<Integer>> output =
                Powerset.powerset(new ArrayList<Integer>(Arrays.asList(1)));
        assertTrue(output.size() == 2);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
    }

    @Test
    public void TestCase3() {
        List<List<Integer>> output =
                Powerset.powerset(new ArrayList<Integer>(Arrays.asList(1, 2)));
        assertTrue(output.size() == 4);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
    }

    @Test
    public void TestCase4() {
        List<List<Integer>> output =
                Powerset.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
        assertTrue(output.size() == 8);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
    }

    @Test
    public void TestCase5() {
        List<List<Integer>> output =
                Powerset.powerset(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)));
        assertTrue(output.size() == 16);
        assertTrue(contains(output, new int[] {}));
        assertTrue(contains(output, new int[] {1}));
        assertTrue(contains(output, new int[] {2}));
        assertTrue(contains(output, new int[] {1, 2}));
        assertTrue(contains(output, new int[] {3}));
        assertTrue(contains(output, new int[] {1, 3}));
        assertTrue(contains(output, new int[] {2, 3}));
        assertTrue(contains(output, new int[] {1, 2, 3}));
        assertTrue(contains(output, new int[] {4}));
        assertTrue(contains(output, new int[] {1, 4}));
        assertTrue(contains(output, new int[] {2, 4}));
        assertTrue(contains(output, new int[] {1, 2, 4}));
        assertTrue(contains(output, new int[] {3, 4}));
        assertTrue(contains(output, new int[] {1, 3, 4}));
        assertTrue(contains(output, new int[] {2, 3, 4}));
        assertTrue(contains(output, new int[] {1, 2, 3, 4}));
    }

    public boolean contains(List<List<Integer>> arr1, int[] arr2) {
        for (List<Integer> subArr : arr1) {
            Collections.sort(subArr);
            if (compare(subArr, arr2)) {
                return true;
            }
        }
        return false;
    }

    public boolean compare(List<Integer> arr1, int[] arr2) {
        if (arr1.size() != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}