package trees;

import java.util.Scanner;
public class Treeuse {
	
	public static TreeNode<Integer> takeInput(Scanner s) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter no. of children for" +n);
		int childCount = s.nextInt();
		
		for(int i=0;i<childCount;i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for(int i=0;i<root.children.size();i++) {
			s= s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		TreeNode<Integer> root= takeInput(Scanner s);
		print(root);

	}

}
