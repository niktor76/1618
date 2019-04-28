package ke2.ea3;

public class BinaryTree {
	private BinaryNode root;

	public BinaryTree(int value) {
		root = new BinaryNode(value);
	}

	public BinaryTree() {
		root = null;
	}

	public boolean contains(int value) {
		BinaryNode index = root;
		boolean found = false;
		while ((index != null) && !found) {
			if (index.value == value) {
				found = true;
			} else if (value < index.value) {
				index = index.leftSon;
			} else {
				index = index.rightSon;
			}
		}
		return found;
	}

	public void insert(int value) {
		// Sonderfall leerer Baum
		if (root == null) {
			root = new BinaryNode(value);
			return;
		}

		// Wenn Schlüssel im Baum enthalten
		if (this.contains(value)) {
			return;
		}

		// Wenn Baume nicht leer und Schlüssel im Baum nicht enthalten.
		// Suche Einfügestelle für den neuen Knoten
		BinaryNode index = root;
		BinaryNode lastNode = null;
		while (index != null) {
			lastNode = index; // Referenz auf letzten Knoten merken
			if (value < index.value) {
				index = index.leftSon;
			} else {
				index = index.rightSon;
			}
		}

		// neuen Knoten einfügen
		BinaryNode newNode = new BinaryNode(value);
		if (value < lastNode.value) {
			lastNode.leftSon = newNode;
		} else {
			lastNode.rightSon = newNode;
		}
	}

	public void inorder() {
		// Reihenfolge der Schlüsselwerte wird in aufsteigender Folge ausgegeben.
		inorderRek(this.root);
	}

	private void inorderRek(BinaryNode node) {
		// nach links gehen, wenn möglich
		if (node.leftSon != null) {
			inorderRek(node.leftSon);
		}
		// Schlüssel ausgeben
		System.out.println(node.value);
		// nach rechts gehen, wenn möglich
		if (node.rightSon != null) {
			inorderRek(node.rightSon);
		}
	}

	private static class BinaryNode {
		private BinaryNode leftSon, rightSon;

		private int value;

		public BinaryNode(int value) {
			this.value = value;
		}
	}
}