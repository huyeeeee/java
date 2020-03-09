package dataStructure.BinaryTree;

public class TreeNode <T>{
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	private TreeNode<T> father;

	public TreeNode(T data,TreeNode<T> left,TreeNode<T> right,TreeNode<T> father){
		this.data = data;
		this.left = left;
		this.right = right;
		this.father = father;
	}

	public TreeNode(T data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.father = null;
	}

	public T getData() {
		return data;
	}

	public TreeNode<T> getFather() {
		return father;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setFather(TreeNode<T> father) {
		this.father = father;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public void setData(T data) {

		this.data = data;
	}

	public void linkLeft(TreeNode<T> left){
		//将左儿子连接起来
		this.setLeft(left);
		left.setFather(this);
	}

	public void linkRight(TreeNode<T> right){
		//将右儿子连接起来
		this.setRight(right);
		right.setFather(this);
	}

	public boolean equals(TreeNode<T> obj) {
		//比较两个结点的大小
		return this.getData().equals(obj.getData());
	}

	public boolean hasLeft(){
		//是否有左儿子
		return this.left != null;
	}

	public boolean hasRight(){
		//是否有右儿子
		return this.right != null;
	}

	public boolean hasFather(){
		return this.father != null;
	}
}
