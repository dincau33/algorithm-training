package binarysearchtree.medium;

/*
 * You are given a Binary Tree data structure consisting of Binary Tree nodes. Each Binary Tree node has an integer value stored in a property called "value" and two children nodes stored in properties called "value" and two children nodes stored in properties called "left" and "right", respectively.
 * Children nodes can either be Binary Tree nodes themselves or the None (Null) value.
 * Write a function that returns a boolean representing whether or not the Binary Tree is a valid BST.
 * A node is said to be a BST node if and only if it satisfies the BST property: its value is strictly greater than the values of every node to its left; its value is less than or equal to the values of every node to its right; and both of its children nodes are either BST nodes themselves or None (null) values.
 */
public class BSTValidation {
	public static boolean validateBst(BST tree) {
		return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean validateBst(BST tree, int min, int max) {
		if (tree == null) return true;
		if (tree.value < min || tree.value > max) return false;
		return validateBst(tree.left, min, tree.value - 1) && validateBst(tree.right, tree.value, max);
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
