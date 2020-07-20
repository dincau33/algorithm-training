package binarysearchtree.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSTTraversalTest {
	public TestBST test1;
	public TestBST test2;
	public TestBST test3;

	public BSTTraversalTest() {
		this.test1 = new TestBST(10);
		this.test1.insert(5).insert(15);
		this.test2 = new TestBST(10);
		this.test2.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22);
		this.test3 = new TestBST(100);
		this.test3
				.insert(5)
				.insert(15)
				.insert(5)
				.insert(2)
				.insert(1)
				.insert(22)
				.insert(1)
				.insert(1)
				.insert(3)
				.insert(1)
				.insert(1)
				.insert(502)
				.insert(55000)
				.insert(204)
				.insert(205)
				.insert(207)
				.insert(206)
				.insert(208)
				.insert(203);
	}

	@Test
	public void TestCase1() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 10, 15));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.inOrderTraverse(this.test1, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase2() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 5, 10, 15, 22));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.inOrderTraverse(this.test2, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase3() {
		List<Integer> expected =
				new ArrayList<Integer>(
						Arrays.asList(
								1, 1, 1, 1, 1, 2, 3, 5, 5, 15, 22, 100, 203, 204, 205, 206, 207, 208, 502, 55000));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.inOrderTraverse(this.test3, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase4() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(10, 5, 15));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.preOrderTraverse(this.test1, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase5() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(10, 5, 2, 1, 5, 15, 22));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.preOrderTraverse(this.test2, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase6() {
		List<Integer> expected =
				new ArrayList<Integer>(
						Arrays.asList(
								100, 5, 2, 1, 1, 1, 1, 1, 3, 15, 5, 22, 502, 204, 203, 205, 207, 206, 208, 55000));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.preOrderTraverse(this.test3, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase7() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(5, 15, 10));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.postOrderTraverse(this.test1, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase8() {
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 5, 22, 15, 10));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.postOrderTraverse(this.test2, output);
		assertTrue(this.compare(output, expected));
	}

	@Test
	public void TestCase9() {
		List<Integer> expected =
				new ArrayList<Integer>(
						Arrays.asList(
								1, 1, 1, 1, 1, 3, 2, 5, 22, 15, 5, 203, 206, 208, 207, 205, 204, 55000, 502, 100));
		List<Integer> output = new ArrayList<Integer>();
		BSTTraversal.postOrderTraverse(this.test3, output);
		assertTrue(this.compare(output, expected));
	}

	private boolean compare(List<Integer> array1, List<Integer> array2) {
		if (array1.size() != array2.size()) {
			return false;
		}
		for (int i = 0; i < array1.size(); i++) {
			if (!array1.get(i).equals(array2.get(i))) {
				return false;
			}
		}
		return true;
	}

	class TestBST extends BSTTraversal.BST {
		public TestBST(int value) {
			super(value);
		}

		public TestBST insert(int value) {
			BSTTraversal.BST current = null;
			if (value < this.value) {
				if (this.left == null) {
					BSTTraversal.BST newBST = new BSTTraversal.BST(value);
					this.left = newBST;
					return this;
				} else {
					current = this.left;
				}
			} else {
				if (right == null) {
					BSTTraversal.BST newBST = new BSTTraversal.BST(value);
					this.right = newBST;
					return this;
				} else {
					current = this.right;
				}
			}
			while (true) {
				if (value < current.value) {
					if (current.left == null) {
						BSTTraversal.BST newBST = new BSTTraversal.BST(value);
						current.left = newBST;
						return this;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						BSTTraversal.BST newBST = new BSTTraversal.BST(value);
						current.right = newBST;
						return this;
					} else {
						current = current.right;
					}
				}
			}
		}
	}
}