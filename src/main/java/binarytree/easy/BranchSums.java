package binarytree.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function that takes in a Binary Tree and returns a list of its branch sums (ordered from leftmost branch to rightmost branch sum).
 * A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree branch is a path of nodes in a tree that starts at the root node and ends at any leaf node.
 * Each Binary Tree node has a value stored in a property called "value" and two children nodes stored in properties called "left" and "right", respectively.
 * Children nodes can either be Binary Tree nodes themselves or the None (null) value.
 */
class BranchSums {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<Integer>();
        branchSumsHelper(root, 0, sums);
        return sums;
    }

    public static void branchSumsHelper(BinaryTree root, int sum, List<Integer> sums) {
        sum += root.value;
        if (root.left == null && root.right == null) {
            sums.add(sum);
            return;
        }
        if (root.left != null) branchSumsHelper(root.left, sum, sums);
        if (root.right != null) branchSumsHelper(root.right, sum, sums);
    }
}
