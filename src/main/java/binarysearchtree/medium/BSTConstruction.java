package binarysearchtree.medium;

public class BSTConstruction {
	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

		// Average: O(log(N)) | O(N)
		public BST insert(int value) {
			if (value < this.value) {
				if (this.left == null) {
					this.left = new BST(value);
				} else this.left.insert(value);
			} else {
				if (this.right == null) {
					this.right = new BST(value);
				} else this.right.insert(value);
			}
			return this;
		}

		// Average: O(log(N)) | O(1)
		public boolean contains(int value) {
			if (value == this.value) return true;
			else if (value < this.value && this.left != null) return this.left.contains(value);
			else if (value > this.value && this.right !=null) return this.right.contains(value);
			else return false;
		}

		// Average: O(log(N)) | O(1)
		public BST remove(int value) {
			// 0 - If there is no leaf then remove
			// 1 - If there is only one leaf then remove and connect the leaf to parent tree
			// 2 - If there is 2 leaf, find minimum in the right substree of node and replace node
			if (value == this.value) {
				// Code to be added
				// need to keep track of the parent
			} else if (value < this.value && this.left != null) this.left.remove(value);
			else if (value > this.value && this.right != null) this.right.remove(value);
			return this;
		}

		private BST findMin() {
			if (this.left != null) {
				return this.left.findMin();
			} else return this;
		}
	}
}
