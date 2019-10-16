package binarysearchtree.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSTValidationTest {
	public TestBST test1;
	public TestBST test2;
	public TestBST test3;
	public TestBST test4;
	public TestBST test5;
	public TestBST test6;
	public TestBST test7;
	public TestBST test8;
	public TestBST test9;
	public TestBST test10;
	public TestBST test11;

	public BSTValidationTest() {
		this.test1 = new TestBST(10);
		this.test1.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22).insert(13).insert(14);

		this.test2 = new TestBST(10);
		this.test2
				.insert(5)
				.insert(15)
				.insert(5)
				.insert(2)
				.insert(1)
				.insert(22)
				.insert(-5)
				.insert(-15)
				.insert(-5)
				.insert(-2)
				.insert(-1)
				.insert(-22);

		this.test3 = new TestBST(10);

		this.test4 = new TestBST(10);
		this.test4
				.insert(5)
				.insert(15)
				.insert(5)
				.insert(2)
				.insert(1)
				.insert(22)
				.insert(500)
				.insert(1500)
				.insert(50)
				.insert(200)
				.insert(10000)
				.insert(2200);

		this.test5 = new TestBST(5000);
		this.test5
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

		this.test6 = new TestBST(10);
		this.test6.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22);
		test6.left.right.right = new BSTValidation.BST(11);

		this.test7 = new TestBST(10);
		this.test7
				.insert(5)
				.insert(15)
				.insert(5)
				.insert(2)
				.insert(1)
				.insert(22)
				.insert(-5)
				.insert(-15)
				.insert(-5)
				.insert(-2)
				.insert(-1)
				.insert(-22);
		test7.left.left.left.left.left.left.left = new BSTValidation.BST(11);

		this.test8 = new TestBST(10);
		this.test8.insert(12);
		test8.left = new TestBST(11);

		this.test9 = new TestBST(10);
		this.test9
				.insert(5)
				.insert(15)
				.insert(5)
				.insert(2)
				.insert(1)
				.insert(22)
				.insert(500)
				.insert(1500)
				.insert(50)
				.insert(200)
				.insert(10000)
				.insert(2200);
		test9.right.right.right.right.right.right = new BSTValidation.BST(9999);

		this.test10 = new TestBST(100);
		this.test10
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
		test10.right.left.right.left = new BSTValidation.BST(300);

		this.test11 = new TestBST(10);
		this.test11.insert(5).insert(15);
		test11.left.right = new BSTValidation.BST(10);
	}

	@Test
	public void TestCase1() {
		assertTrue(BSTValidation.validateBst(test1));
	}

	@Test
	public void TestCase2() {
		assertTrue(BSTValidation.validateBst(test2));
	}

	@Test
	public void TestCase3() {
		assertTrue(BSTValidation.validateBst(test3));
	}

	@Test
	public void TestCase4() {
		assertTrue(BSTValidation.validateBst(test4));
	}

	@Test
	public void TestCase5() {
		assertTrue(BSTValidation.validateBst(test5));
	}

	@Test
	public void TestCase6() {
		assertTrue(!BSTValidation.validateBst(test6));
	}

	@Test
	public void TestCase7() {
		assertTrue(!BSTValidation.validateBst(test7));
	}

	@Test
	public void TestCase8() {
		assertTrue(!BSTValidation.validateBst(test8));
	}

	@Test
	public void TestCase9() {
		assertTrue(!BSTValidation.validateBst(test9));
	}

	@Test
	public void TestCase10() {
		assertTrue(!BSTValidation.validateBst(test10));
	}

	@Test
	public void TestCase11() {
		assertTrue(!BSTValidation.validateBst(test11));
	}

	class TestBST extends BSTValidation.BST {
		public TestBST(int value) {
			super(value);
		}

		public TestBST insert(int value) {
			BSTValidation.BST current = null;
			if (value < this.value) {
				if (this.left == null) {
					BSTValidation.BST newBST = new BSTValidation.BST(value);
					this.left = newBST;
					return this;
				} else {
					current = this.left;
				}
			} else {
				if (right == null) {
					BSTValidation.BST newBST = new BSTValidation.BST(value);
					this.right = newBST;
					return this;
				} else {
					current = this.right;
				}
			}
			while (true) {
				if (value < current.value) {
					if (current.left == null) {
						BSTValidation.BST newBST = new BSTValidation.BST(value);
						current.left = newBST;
						return this;
					} else {
						current = current.left;
					}
				} else {
					if (current.right == null) {
						BSTValidation.BST newBST = new BSTValidation.BST(value);
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