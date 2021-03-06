package binarysearchtree.medium;

/*
 * You are given a BST data structure consisting of BST nodes. Each BST node has an integer value stored in a property called "value" and two children nodes store din properties called "left" and "right", respectively.
 * A node is said to be a BST node if and only if it satisfies the BST property:
 * its value is strictly greater than the values of every node to its left;
 * its value is less than or equal to the values of every node to is right;
 * and both of its children nodes are either BST nodes themselves or None (null) values.
 * The BST class should support insertion, searching, and removal of values. The removal method should only remove the first instance of the target value.
 */
public class BSTConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        // Average: O(log(n)) time | O(n) space
        // Worst: O(n) time | O(n) space
        public BST insert(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    this.left = new BST(value);
                } else this.left = this.left.insert(value);
            } else {
                if (this.right == null) {
                    this.right = new BST(value);
                } else this.right = this.right.insert(value);
            }
            return this;
        }

        // Average: O(log(n)) time | O(n) space
        // Worst: O(n) time | O(n) space
        public boolean contains(int value) {
            if (value == this.value) return true;
            else if (value < this.value && this.left != null) return this.left.contains(value);
            else if (value > this.value && this.right != null) return this.right.contains(value);
            else return false;
        }

        // Average: O(log(n)) time | O(1) space
        // Worst: O(n) time | O(n) space
        public BST remove(int value) {
            this.remove(value, null);
            return this;
        }

        private BST remove(int value, BST parent) {
            if (value < this.value && this.left != null) this.left.remove(value, this);
            else if (value > this.value && this.right != null) this.right.remove(value, this);
            else {
                if (value == this.value) {
                    if (this.left != null && this.right != null) {
                        // 0 - If there are 2 leafs, find minimum in the right substree of node, replace node with min and delete min from right subtree
                        this.value = this.right.getMinValue();
                        this.right.remove(this.value, this);
                        // 1 - If there is only one leaf then remove and connect the leaf to parent tree
                    } else if (this.left != null) {
                        if (parent == null) {
                            this.value = this.left.value;
                            this.right = this.left.right;
                            this.left = this.left.left;
                        } else if (parent.left == this) parent.left = this.left;
                        else parent.right = this.left;
                    } else {
                        if (parent == null) {
                            this.value = this.right.value;
                            this.left = this.right.left;
                            this.right = this.right.right;
                        } else if (parent.left == this) parent.left = this.right;
                        else parent.right = this.right;
                    }
                }
            }
            return this;
        }

        private int getMinValue() {
            if (this.left != null) {
                return this.left.getMinValue();
            } else return this.value;
        }
    }
}
