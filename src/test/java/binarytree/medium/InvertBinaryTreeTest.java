package binarytree.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;

class InvertBinaryTreeTest {
	@Test
	public void TestCase1() {
		TestBinaryTree test1 = new TestBinaryTree(1);
		InvertBinaryTree.invertBinaryTree(test1);
		InvertedBinaryTree invertedTest1 = new InvertedBinaryTree(1);
		assertTrue(compareBT(test1, invertedTest1));
	}

	@Test
	public void TestCase2() {
		TestBinaryTree test2 = new TestBinaryTree(1);
		test2.insert(new int[] {2}, 0);
		InvertBinaryTree.invertBinaryTree(test2);
		InvertedBinaryTree invertedTest2 = new InvertedBinaryTree(1);
		invertedTest2.insert(new int[] {2}, 0);
		assertTrue(compareBT(test2, invertedTest2));
	}

	@Test
	public void TestCase3() {
		TestBinaryTree test3 = new TestBinaryTree(1);
		test3.insert(new int[] {2, 3}, 0);
		InvertBinaryTree.invertBinaryTree(test3);
		InvertedBinaryTree invertedTest3 = new InvertedBinaryTree(1);
		invertedTest3.insert(new int[] {2, 3}, 0);
		assertTrue(compareBT(test3, invertedTest3));
	}

	@Test
	public void TestCase4() {
		TestBinaryTree test4 = new TestBinaryTree(1);
		test4.insert(new int[] {2, 3, 4}, 0);
		InvertBinaryTree.invertBinaryTree(test4);
		InvertedBinaryTree invertedTest4 = new InvertedBinaryTree(1);
		invertedTest4.insert(new int[] {2, 3, 4}, 0);
		assertTrue(compareBT(test4, invertedTest4));
	}

	@Test
	public void TestCase5() {
		TestBinaryTree test5 = new TestBinaryTree(1);
		test5.insert(new int[] {2, 3, 4, 5}, 0);
		InvertBinaryTree.invertBinaryTree(test5);
		InvertedBinaryTree invertedTest5 = new InvertedBinaryTree(1);
		invertedTest5.insert(new int[] {2, 3, 4, 5}, 0);
		assertTrue(compareBT(test5, invertedTest5));
	}

	@Test
	public void TestCase6() {
		TestBinaryTree test6 = new TestBinaryTree(1);
		test6.insert(new int[] {2, 3, 4, 5, 6}, 0);
		InvertBinaryTree.invertBinaryTree(test6);
		InvertedBinaryTree invertedTest6 = new InvertedBinaryTree(1);
		invertedTest6.insert(new int[] {2, 3, 4, 5, 6}, 0);
		assertTrue(compareBT(test6, invertedTest6));
	}

	@Test
	public void TestCase7() {
		TestBinaryTree test7 = new TestBinaryTree(1);
		test7.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
		InvertBinaryTree.invertBinaryTree(test7);
		InvertedBinaryTree invertedTest7 = new InvertedBinaryTree(1);
		invertedTest7.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
		assertTrue(compareBT(test7, invertedTest7));
	}

	@Test
	public void TestCase8() {
		TestBinaryTree test8 = new TestBinaryTree(1);
		test8.insert(new int[] {2, 3, 4, 5, 6, 7, 8}, 0);
		InvertBinaryTree.invertBinaryTree(test8);
		InvertedBinaryTree invertedTest8 = new InvertedBinaryTree(1);
		invertedTest8.insert(new int[] {2, 3, 4, 5, 6, 7, 8}, 0);
		assertTrue(compareBT(test8, invertedTest8));
	}

	@Test
	public void TestCase9() {
		TestBinaryTree test9 = new TestBinaryTree(1);
		test9.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
		InvertBinaryTree.invertBinaryTree(test9);
		InvertedBinaryTree invertedTest9 = new InvertedBinaryTree(1);
		invertedTest9.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, 0);
		assertTrue(compareBT(test9, invertedTest9));
	}

	@Test
	public void TestCase10() {
		TestBinaryTree test10 = new TestBinaryTree(1);
		test10.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
		InvertBinaryTree.invertBinaryTree(test10);
		InvertedBinaryTree invertedTest10 = new InvertedBinaryTree(1);
		invertedTest10.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10}, 0);
		assertTrue(compareBT(test10, invertedTest10));
	}

	@Test
	public void TestCase11() {
		TestBinaryTree test11 = new TestBinaryTree(1);
		test11.insert(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}, 0);
		InvertBinaryTree.invertBinaryTree(test11);
		InvertedBinaryTree invertedTest11 = new InvertedBinaryTree(1);
		invertedTest11.insert(
				new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18}, 0);
		assertTrue(compareBT(test11, invertedTest11));
	}

	private boolean compareBT(InvertBinaryTree.BinaryTree tree1, InvertedBinaryTree tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		}
		if (tree1 != null && tree2 != null) {
			return tree1.value == tree2.value
					&& compareBT(tree1.left, tree2.left)
					&& compareBT(tree1.right, tree2.right);
		}
		return false;
	}

	class InvertedBinaryTree {
		public int value;
		public InvertedBinaryTree left;
		public InvertedBinaryTree right;

		public InvertedBinaryTree(int value) {
			this.value = value;
		}

		public void insert(int[] values, int i) {
			if (i >= values.length) {
				return;
			}
			ArrayDeque<InvertedBinaryTree> queue = new ArrayDeque<InvertedBinaryTree>();
			queue.addLast(this);
			while (queue.size() > 0) {
				InvertedBinaryTree current = queue.pollFirst();
				if (current.right == null) {
					current.right = new InvertedBinaryTree(values[i]);
					break;
				}
				queue.addLast(current.right);
				if (current.left == null) {
					current.left = new InvertedBinaryTree(values[i]);
					break;
				}
				queue.addLast(current.left);
			}
			insert(values, i + 1);
		}
	}

	class TestBinaryTree extends InvertBinaryTree.BinaryTree {
		public TestBinaryTree(int value) {
			super(value);
		}

		public void insert(int[] values, int i) {
			if (i >= values.length) {
				return;
			}
			ArrayDeque<InvertBinaryTree.BinaryTree> queue = new ArrayDeque<InvertBinaryTree.BinaryTree>();
			queue.addLast(this);
			while (queue.size() > 0) {
				InvertBinaryTree.BinaryTree current = queue.pollFirst();
				if (current.left == null) {
					current.left = new InvertBinaryTree.BinaryTree(values[i]);
					break;
				}
				queue.addLast(current.left);
				if (current.right == null) {
					current.right = new InvertBinaryTree.BinaryTree(values[i]);
					break;
				}
				queue.addLast(current.right);
			}
			insert(values, i + 1);
		}
	}

}