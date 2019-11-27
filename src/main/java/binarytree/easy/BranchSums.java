package binarytree.easy;

import java.util.ArrayList;
import java.util.List;

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
