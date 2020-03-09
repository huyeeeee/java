package dataStructure.BinaryTree;


import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree<T>{
	private TreeNode<T> root;
	public BinaryTree(TreeNode<T> root){
		this.root = root;
	}

	public void firstOrder(TreeNode<T> root){
		//先序遍历
		if (root == null)
			return;
		System.out.print(root.getData() + "\t");
		if (root.hasLeft())
			firstOrder(root.getLeft());
		if (root.hasRight())
			firstOrder(root.getRight());
	}

	public void inOrder(TreeNode<T> root){
		//中序遍历
		if (root == null)
			return;
		if (root.hasLeft())
			inOrder(root.getLeft());
		System.out.print(root.getData() + "\t");
		if (root.hasRight())
			inOrder(root.getRight());
	}

	public void lastOrder(TreeNode<T> root){
		//后序遍历
		if (root == null)
			return;
		if (root.hasLeft())
			lastOrder(root.getLeft());
		if (root.hasRight())
			lastOrder(root.getRight());
		System.out.print(root.getData() + "\t");
	}

	public void floorOrder(TreeNode<T> root){
		//层次遍历
		Queue<TreeNode<T>> temp = new ArrayDeque<>();
		if (root == null)
			return;
		temp.add(root);
		while (!temp.isEmpty()){
			if (temp.peek().hasLeft())
				temp.add(temp.peek().getLeft());
			if (temp.peek().hasRight())
				temp.add(temp.peek().getRight());
			System.out.print(temp.poll().getData() + "\t");
		}
	}

	public static void main(String[] args){
		TreeNode<String> a = new TreeNode<>("+");
		TreeNode<String> b = new TreeNode<>("-");
		TreeNode<String> c = new TreeNode<>("+");
		TreeNode<String> d = new TreeNode<>("1");
		TreeNode<String> e = new TreeNode<>("2");
		TreeNode<String> f = new TreeNode<>("3");
		TreeNode<String> g = new TreeNode<>("4");
		a.linkLeft(b);
		a.linkRight(c);
		b.linkLeft(d);
		b.linkRight(e);
		c.linkLeft(f);
		c.linkRight(g);

		BinaryTree<String> tree = new BinaryTree<>(a);
		System.out.println("first order: ");
		tree.firstOrder(a);
		System.out.println("\nin order: ");
		tree.inOrder(a);
		System.out.println("\nlast order: ");
		tree.lastOrder(a);
		System.out.println("\nfloor order: ");
		tree.floorOrder(a);
	}
}
