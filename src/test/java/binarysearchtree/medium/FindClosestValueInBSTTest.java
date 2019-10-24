package binarysearchtree.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestValueInBSTTest {
    public TestBST test;

    public FindClosestValueInBSTTest() {
        this.test = new TestBST(100);
        this.test
                .insert(5)
                .insert(15)
                .insert(5)
                .insert(2)
                .insert(1)
                .insert(22)
                .insert(1)
                .insert(1)
                .insert(3)
                .insert(1)
                .insert(1)
                .insert(502)
                .insert(55000)
                .insert(204)
                .insert(205)
                .insert(207)
                .insert(206)
                .insert(208)
                .insert(203)
                .insert(-51)
                .insert(-403)
                .insert(1001)
                .insert(57)
                .insert(60)
                .insert(4500);
    }

    @Test
    public void TestCase1() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 100) == 100);
    }

    @Test
    public void TestCase2() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 208) == 208);
    }

    @Test
    public void TestCase3() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 4500) == 4500);
    }

    @Test
    public void TestCase4() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 4501) == 4500);
    }

    @Test
    public void TestCase5() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, -70) == -51);
    }

    @Test
    public void TestCase6() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 2000) == 1001);
    }

    @Test
    public void TestCase7() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 6) == 5);
    }

    @Test
    public void TestCase8() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 30000) == 55000);
    }

    @Test
    public void TestCase9() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, -1) == 1);
    }

    @Test
    public void TestCase10() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 29751) == 55000);
    }

    @Test
    public void TestCase11() {
        assertTrue(FindClosestValueInBST.findClosestValueInBst(this.test, 29749) == 4500);
    }

    class TestBST extends FindClosestValueInBST.BST {
        public TestBST(int value) {
            super(value);
        }

        public TestBST insert(int value) {
            FindClosestValueInBST.BST current = null;
            if (value < this.value) {
                if (this.left == null) {
                    FindClosestValueInBST.BST newBST = new FindClosestValueInBST.BST(value);
                    this.left = newBST;
                    return this;
                } else {
                    current = this.left;
                }
            } else {
                if (right == null) {
                    FindClosestValueInBST.BST newBST = new FindClosestValueInBST.BST(value);
                    this.right = newBST;
                    return this;
                } else {
                    current = this.right;
                }
            }
            while (true) {
                if (value < current.value) {
                    if (current.left == null) {
                        FindClosestValueInBST.BST newBST = new FindClosestValueInBST.BST(value);
                        current.left = newBST;
                        return this;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        FindClosestValueInBST.BST newBST = new FindClosestValueInBST.BST(value);
                        current.right = newBST;
                        return this;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }
}