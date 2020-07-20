package binarytree.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeDepthsTest {
	@Test
	public void TestCase1() {
		NodeDepths.BinaryTree root = new NodeDepths.BinaryTree(1);
		root.left = new NodeDepths.BinaryTree(2);
		root.left.left = new NodeDepths.BinaryTree(4);
		root.left.left.left = new NodeDepths.BinaryTree(8);
		root.left.left.right = new NodeDepths.BinaryTree(9);
		root.left.right = new NodeDepths.BinaryTree(5);
		root.right = new NodeDepths.BinaryTree(3);
		root.right.left = new NodeDepths.BinaryTree(6);
		root.right.right = new NodeDepths.BinaryTree(7);
		int actual = NodeDepths.nodeDepths(root);
		assertEquals(16, actual);
	}

	@Test
	public void TestCase2() {
		NodeDepths.BinaryTree root = new NodeDepths.BinaryTree(1);
		int actual = NodeDepths.nodeDepths(root);
		assertEquals(0, actual);
	}
}