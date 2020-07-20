package binarytree.easy;

/*
 * The distance between a node in a Binary Tree ad the tree's root is called the node's depth.
 * Write a function that takes in a Binary Tree and returns the som of its nodes's depths.
 * Each BinaryTree node has an integer value, a left child node, and a right child node. Children nodes can either be BinaryTree nodes themselves or None / null.
 */
public class NodeDepths {

	public static int nodeDepths(BinaryTree root) {
		return nodeDepths(root, 0);

	}

	public static int nodeDepths(BinaryTree root, int depth) {
		if (root == null) return 0;
		return nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1) + depth;
	}

	static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

}
