package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FourNumberSumTest {
    private boolean compare(List<Integer[]> quads1, List<Integer[]> quads2) {
        for (Integer[] quad : quads2) {
            Arrays.sort(quad);
        }
        for (Integer[] quad : quads1) {
            Arrays.sort(quad);
        }
        for (Integer[] quad2 : quads2) {
            boolean found = false;
            for (Integer[] quad1 : quads1) {
                if (Arrays.equals(quad2, quad1)) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {1, 2, 3, 4, 5, 6, 7}, 10);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {1, 2, 3, 4});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase2() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {7, 6, 4, -1, 1, 2}, 16);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {7, 6, 4, -1});
        quadruplets.add(new Integer[] {7, 6, 1, 2});
        assertTrue(quadruplets.size() == output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase3() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {5, -5, -2, 2, 3, -3}, 0);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {5, -5, -2, 2});
        quadruplets.add(new Integer[] {5, -5, 3, -3});
        quadruplets.add(new Integer[] {-2, 2, 3, -3});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase4() {
        List<Integer[]> output =
                FourNumberSum.fourNumberSum(new int[] {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {-2, -1, 1, 6});
        quadruplets.add(new Integer[] {-2, 1, 2, 3});
        quadruplets.add(new Integer[] {-2, -1, 2, 5});
        quadruplets.add(new Integer[] {-2, -1, 3, 4});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase5() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {-1, 22, 7, 2});
        quadruplets.add(new Integer[] {22, 4, 7, -3});
        quadruplets.add(new Integer[] {-1, 18, 11, 2});
        quadruplets.add(new Integer[] {18, 4, 11, -3});
        quadruplets.add(new Integer[] {22, 11, 2, -5});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase6() {
        List<Integer[]> output =
                FourNumberSum.fourNumberSum(new int[] {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        quadruplets.add(new Integer[] {-5, 2, 15, 8});
        quadruplets.add(new Integer[] {-3, 2, -7, 28});
        quadruplets.add(new Integer[] {-10, -3, 28, 5});
        quadruplets.add(new Integer[] {-10, 28, -6, 8});
        quadruplets.add(new Integer[] {-7, 28, -6, 5});
        quadruplets.add(new Integer[] {-5, 2, 12, 11});
        quadruplets.add(new Integer[] {-5, 12, 8, 5});
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }

    @Test
    public void TestCase7() {
        List<Integer[]> output = FourNumberSum.fourNumberSum(new int[] {1, 2, 3, 4, 5}, 100);
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();
        assertEquals(quadruplets.size(), output.size());
        assertTrue(this.compare(quadruplets, output));
    }
}