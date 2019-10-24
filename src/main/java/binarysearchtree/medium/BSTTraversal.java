package binarysearchtree.medium;

import java.util.ArrayList;
/*
 * You are given a BST data structure consisting of BST nodes. Each BST node has an integer value stored in a property called "value" and two children nodes store din properties called "left" and "right", respectively.
 * A node is said to be a BST node if and only if it satisfies the BST property:
 * its value is strictly greater than the values of every node to its left;
 * its value is less than or equal to the values of every node to is right;
 * and both of its children nodes are either BST nodes themselves or None (null) values.
 * Write three functions should traverse the BST using the in-order traversal, pre-order traversal, and post-order traversal techniques, respectively
 */
public class BSTTraversal {
	// O(n) time | O(n) space - where n is the number of nodes in the BST
	public static ArrayList<Integer> inOrderTraverse(BST tree, ArrayList<Integer> array) {
		if (tree.left != null) array = inOrderTraverse(tree.left, array);
		array.add(tree.value);
		if (tree.right != null) array = inOrderTraverse(tree.right, array);
		return array;
	}

	public static ArrayList<Integer> preOrderTraverse(BST tree, ArrayList<Integer> array) {
		array.add(tree.value);
		if (tree.left != null) array = preOrderTraverse(tree.left, array);
		if (tree.right != null) array = preOrderTraverse(tree.right, array);
		return array;
	}

	public static ArrayList<Integer> postOrderTraverse(BST tree, ArrayList<Integer> array) {
		if (tree.left != null) array = postOrderTraverse(tree.left, array);
		if (tree.right != null) array = postOrderTraverse(tree.right, array);
		array.add(tree.value);
		return array;
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
