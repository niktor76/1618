package ke4.ea1;

public class BinaryTreeTest {
	public static void main(String[] args) {
		BinaryTree<String> bt = new BinaryTree<String>();
		bt.insert("Asdf");
		bt.insert("Jdfad");
		bt.insert("gadrefdd");
		bt.insert("ytfjghf");
		bt.insert("Aadfg");
		bt.insert("hfgdfg");
		bt.insert("Berte");
		bt.insert("KuiKl");
		bt.insert("etzf");
		bt.insert("Hftzu");
		bt.insert("Lopder");
		bt.inorder();
	}
}
