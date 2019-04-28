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

		// Wenn Schl�ssel im Baum enthalten
		if (this.contains(value)) {
			return;
		}

		// Wenn Baume nicht leer und Schl�ssel im Baum nicht enthalten.
		// Suche Einf�gestelle f�r den neuen Knoten
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

		// neuen Knoten einf�gen
		BinaryNode newNode = new BinaryNode(value);
		if (value < lastNode.value) {
			lastNode.leftSon = newNode;
		} else {
			lastNode.rightSon = newNode;
		}
	}

	public void inorder() {
		// Reihenfolge der Schl�sselwerte wird in aufsteigender Folge ausgegeben.
		inorderRek(this.root);
	}

	private void inorderRek(BinaryNode node) {
		// nach links gehen, wenn m�glich
		if (node.leftSon != null) {
			inorderRek(node.leftSon);
		}
		// Schl�ssel ausgeben
		System.out.println(node.value);
		// nach rechts gehen, wenn m�glich
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