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
				} else this.left = this.left.insert(value);
			} else {
				if (this.right == null) {
					this.right = new BST(value);
				} else this.right = this.right.insert(value);
			}
			return this;
		}

		// Average: O(log(N)) | O(1)
		public boolean contains(int value) {
			if (value == this.value) return true;
			else if (value < this.value && this.left != null) return this.left.contains(value);
			else if (value > this.value && this.right != null) return this.right.contains(value);
			else return false;
		}

		// Average: O(log(N)) | O(1)
		public BST remove(int value) {
			this.remove(value, null);
			return this;
		}

		private BST remove(int value, BST parent) {
			if (value < this.value && this.left != null) this.left.remove(value, this);
			else if (value > this.value && this.right != null) this.right.remove(value, this);
			else {
				if (value == this.value) {
					// 0 - If there is 2 leaf, find minimum in the right substree of node and replace node
					if (this.left != null && this.right != null) {
						this.value = this.right.getMinValue();
						this.right.remove(this.value, this);
						// 1 - If there is no leaf then remove
						// 1 - If there is only one leaf then remove and connect the leaf to parent tree
					} else if (parent == null) {
						if (this.left != null) {
							this.value = this.left.value;
							this.right = this.left.right;
							this.left = this.left.left;
						} else if (this.right != null) {
							this.value = this.right.value;
							this.left = this.right.left;
							this.right = this.right.right;
						} else {
							this.value = 0;
						}
					} else if (parent.left == this) {
						parent.left = this.left != null ? this.left : this.right;
					} else if (parent.right == this) {
						parent.right = this.left != null ? this.left : this.right;
					}
				}
			}
			return this;
		}

		private int getMinValue() {
			if (this.left != null) {
				return this.left.getMinValue();
			} else return this.value;
		}
	}
}
