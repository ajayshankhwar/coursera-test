package trees;

public class Node {
	int data;
	Node left;
	Node right;
}
	class BinaryTree{
		public Node createNewNode(int value) {
		Node a = new Node();
		a.data = value;
		a.left = null;
		a.right = null;
		}
	}
	
	public class BinaryTreeApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree a = new BinaryTree();
		Node root = a.createNewNode(2);
		 root.left = a.createNewNode(7);
		root.right = a.createNewNode(5);
		root.left.left = a.createNewNode(2);
		 root.left.right = a.createNewNode(6);
		root.left.left.left = a.createNewNode(1);
		root.left.left.right = a.createNewNode(0);
		
		}
	}


