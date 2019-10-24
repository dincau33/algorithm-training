package binarytree.medium;

import java.util.ArrayList;

/*
 * Write a function that takes in a Binary Tree and inverts it. In other words, the function should swap every left node in the tree for its corresponding (mirrored) right node.
 * each Binary Tree node has a value stored in property called "value" and two children nodes stored in properties called "left" and "right", respectively.
 * Children nodes can either be Binary Tree nodes themselves or the None (null) value.
 */
public class InvertBinaryTree {
	// Complexity: O(n) time | O(n) space
	public static void invertBinaryTree(BinaryTree tree) {
		if (tree.left != null) invertBinaryTree(tree.left);
		if (tree.right != null) invertBinaryTree(tree.right);
		swapChildren(tree);
	}

	private static void swapChildren(BinaryTree tree) {
		BinaryTree tmp = tree.left;
		tree.left = tree.right;
		tree.right = tmp;
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}
}
