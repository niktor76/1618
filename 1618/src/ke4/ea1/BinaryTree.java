package ke4.ea1;

public class BinaryTree<T extends Comparable<T>> {
	private BinaryNode<T> root;

	public BinaryTree(T value) {
		this.root = new BinaryNode<T>(value);
	}

	public BinaryTree() {
		/* ... */ }

	public boolean contains(T value) {
		if (root == null) {
			return false;
		}
		return root.contains(value);
	}

	public void insert(T value) {
		if (root == null) {
			root = new BinaryNode<T>(value);
		} else {
			if (!root.contains(value)) {
				root.insert(value);
			}
		}
	}

	public void inorder() {
		if (root != null) {
			root.inorder();
		}
	}

	private static class BinaryNode<ET extends Comparable<ET>> {
		private BinaryNode<ET> leftSon, rightSon;
		private ET value;

		public BinaryNode(ET value) {
			this.value = value;
		}

		public void inorder() {
			if (leftSon != null) {
				leftSon.inorder();
			}
			System.out.println(value);
			if (rightSon != null) {
				rightSon.inorder();
			}
		}

		public void insert(ET value) {
			if (value.compareTo(this.value) < 0) {
				// go left
				if (this.leftSon == null) {
					leftSon = new BinaryNode<ET>(value);
				} else {
					leftSon.insert(value);
				}
			} else {
				// go right
				if (this.rightSon == null) {
					rightSon = new BinaryNode<ET>(value);
				} else {
					rightSon.insert(value);
				}
			}
		}

		public boolean contains(ET value) {
			int i = value.compareTo(this.value);
			if (i == 0) {
				return true;
			}
			if (i < 0) {
				if (leftSon != null) {
					return leftSon.contains(value);
				} else {
					return false;
				}
			} else {
				if (rightSon != null) {
					return rightSon.contains(value);
				} else {
					return false;
				}
			}
		}

	}
}