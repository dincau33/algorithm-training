package binarysearchtree.medium;
/*
 * You are given a BST data structure consisting of BST nodes. Each BST node has an integer value stored in a property called "value" and two children nodes store din properties called "left" and "right", respectively.
 * A node is said to be a BST node if and only if it satisfies the BST property:
 * its value is strictly greater than the values of every node to its left;
 * its value is less than or equal to the values of every node to is right;
 * and both of its children nodes are either BST nodes themselves or None (null) values.
 * You are also given a target integer value; write a function that finds the closest value to that target value contained in the BST. Assume that there will only be one closest value
 */
public class FindClosestValueInBST {
    // Worst: O(n) time | O(n) space
    // Average: O(log(n)) time | O(log(n)) space
    public static int findClosestValueInBst(BST tree, int target) {
        int closest = tree.value;

        // if |left - target| <= |closest - target| then closest = left
        if (tree.left != null && target < closest) {
            int leftClosest = findClosestValueInBst(tree.left, target);
            if (Math.abs(leftClosest - target) < Math.abs(closest - target)) closest = leftClosest;
        }

        // if |right - target| <= |closest - target| then closest = right
        if (tree.right != null && target > closest) {
            int rightClosest = findClosestValueInBst(tree.right, target);
            if (Math.abs(rightClosest - target) < Math.abs(closest - target)) closest = rightClosest;
        }

        return closest;
        // Write your code here.
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
