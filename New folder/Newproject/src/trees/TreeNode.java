package trees;

import java.util.ArrayList;

public class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children;
	//Children has same type if data as root
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
}
-=