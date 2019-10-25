package linkedlist.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KthNodeFromEndTest {
    @Test
    public void TestCase1() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 1);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase2() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 2);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase3() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 3);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase4() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 4);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase5() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 5);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase6() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 3, 5, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 6);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase7() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 2, 4, 5, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 7);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase8() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 1, 3, 4, 5, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 8);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase9() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 9);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    @Test
    public void TestCase10() {
        TestLinkedList test = new TestLinkedList(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        KthNodeFromEnd.removeKthNodeFromEnd(test, 10);
        assertTrue(compare(test.getNodesInArray(), expected));
    }

    public boolean compare(ArrayList<Integer> arr1, int[] arr2) {
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

    class TestLinkedList extends KthNodeFromEnd.LinkedList {

        public TestLinkedList(int value) {
            super(value);
        }

        public void addMany(int[] values) {
            KthNodeFromEnd.LinkedList current = this;
            while (current.next != null) {
                current = current.next;
            }
            for (int value : values) {
                current.next = new KthNodeFromEnd.LinkedList(value);
                current = current.next;
            }
        }

        public ArrayList<Integer> getNodesInArray() {
            ArrayList<Integer> nodes = new ArrayList<Integer>();
            KthNodeFromEnd.LinkedList current = this;
            while (current != null) {
                nodes.add(current.value);
                current = current.next;
            }
            return nodes;
        }
    }
}