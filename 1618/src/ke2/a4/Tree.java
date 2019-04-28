package ke2.a4;

public class Tree {
	Object value;
	Tree[] children;

	Tree() {
		this.value = null;
		this.children = null;
	}

	Tree(Object value) {
		this.value = value;
	}

	Tree(Object value, Object child1) {
		this.value = value;
		this.children = new Tree[1];
		if (child1 != null) {
			this.children[0].value = child1;
		}
	}

	Tree(Object value, Object child1, Object child2) {
		this.value = value;
		this.children = new Tree[2];
		if (child1 != null) {
			this.children[0].value = child1;
		}
		if (child2 != null) {
			this.children[1].value = child2;
		}
	}

	public static void main(String[] args) {
		Object obj = new Object();
		Tree tr1 = new Tree(obj, null, null);
		Tree tr2 = new Tree(obj, null, null);
		Tree tr3 = new Tree(null, null, null);
		tr3.value = tr3.children;
		tr2.children[0] = tr3;
		Tree tr4 = new Tree(null, null);
		tr4.value = tr4;
		tr2.children[1] = tr4;
	}
}
