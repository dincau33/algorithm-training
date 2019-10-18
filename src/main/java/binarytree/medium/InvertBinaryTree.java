package binarytree.medium;

import java.util.ArrayList;

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
