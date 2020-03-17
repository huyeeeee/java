import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

class TreeNode {
	public TreeNode right;
	public TreeNode left;
	public double item;

	public TreeNode(double item){
		this.item = item;
	}
}
public class BinarySearchTree {
	public TreeNode root;// the first element in the set
	static BinarySearchTree intersectionResult = new BinarySearchTree();
	//the intersection result

	static BinarySearchTree unionResult = new BinarySearchTree();
	//the union result

	static BinarySearchTree differenceResult = new BinarySearchTree();
	// the difference result

	static boolean subsetResult = true;
	//the subset result

	public BinarySearchTree(){
	}

	public BinarySearchTree(TreeNode root){
		this.root = root;
	}

	/**
	 * check if the set is empty
	 * @param root the first element
	 * @return true if it is empty
	 */
	public static boolean isEmpty(TreeNode root){
		return root == null;
	}

	/**
	 * the size of the Set
	 * @param root the Set's first element
	 * @return an integer number that is the length of the Set
	 */
	public static int size(TreeNode root){
		if (isEmpty(root)){
			return 0;
		}
		return 1 + size(root.left) + size(root.right);
	}

	/**
	 * add element to the set if the element is not exist
	 * @param btree the set
	 * @param item the element that will be added
	 */
	public static void add(BinarySearchTree btree,double item){
		TreeNode treeNode = new TreeNode(item);
		if (isEmpty(btree.root)){
			btree.root = treeNode;
			return;
		}
		TreeNode parent = btree.root;
		TreeNode current = btree.root;
		while (true){
			parent = current;
			if (current.item == item){
				return;
			}
			else if (current.item > item){
				current = current.left;
				if (current == null){
					parent.left = treeNode;
					return;
				}
			}
			else {
				current = current.right;
				if (current == null){
					parent.right = treeNode;
					return;
				}
			}
		}
	}

	/**
	 * check if the element in the set
	 * @param root the first element in the set
	 * @param item the element that will be found
	 * @return true if the element is in the set
	 */
	public static boolean isElement(TreeNode root,double item){
		TreeNode temp = root;
		while (true){
			if (temp == null){
				return false;
			}
			if (temp.item == item){
				return true;
			}
			else if(temp.item > item){
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
		}
	}

	/**
	 * remove the element
	 * @param btree the set
	 * @param item the element that will be removed
	 *
	 */
	public static void remove(BinarySearchTree btree,double item){
		deleteNode(btree.root,item);
	}

	/**
	 * delete the node in the binary search tree
	 * @param root
	 * @param item
	 * @return
	 */
	private static TreeNode deleteNode(TreeNode root, double item) {
		if (root == null) {
			return null;
		}
		if (item < root.item) {
			// the remove node is in the left child tree
			root.left = deleteNode(root.left, item);
			return root;
		} else if (item > root.item) {
			// the remove node is in the right child tree
			root.right = deleteNode(root.right, item);
			return root;
		} else {
			if (root.left == null) {
				// make the right child tree be the new root
				return root.right;
			} else if (root.right == null) {
				// make the left child tree be the new root
				return root.left;
			} else {
				// if the remove node has two node, make the successor node be the now root
				TreeNode successor = min(root.right);
				successor.right = deleteMin(root.right);
				successor.left = root.left;
				return successor;
			}
		}
	}

	/**
	 * find the minimum element in the set
	 * @param node the first element in the set
	 * @return
	 */
	private static TreeNode min(TreeNode node) {
		if (node.left == null) {
			return node;
		}
		return min(node.left);
	}

	/**
	 * delete the minimum element in the set
	 * @param node
	 * @return
	 */
	private static TreeNode deleteMin(TreeNode node) {
		if (node.left == null) {
			return node.right;
		}
		node.left = deleteMin(node.left);
		return node;
	}

	public static void inorder(TreeNode root){
		if (root.left != null)
			inorder(root.left);
		if (root != null){
			System.out.println(root.item);
		}

		if (root.right != null)
			inorder(root.right);
	}

	/**
	 * the intersection of two sets
	 * @param b1
	 * @param b2
	 * @return the result
	 */
	public static BinarySearchTree intersection(BinarySearchTree b1,BinarySearchTree b2){
		intersectionTreeNode(b1.root,b2.root);
		return intersectionResult;
	}

	/**
	 * the intersection of two sets
	 * @param t1
	 * @param t2
	 */
	private static void intersectionTreeNode(TreeNode t1,TreeNode t2){
		if (t1 != null){
			if (isElement(t2,t1.item))
				add(intersectionResult,t1.item);
			if (t1.left != null) {
				intersectionTreeNode(t1.left,t2);
			}
			if (t1.right != null){
				intersectionTreeNode(t1.right,t2);
			}
		}


	}

	/**
	 * the union result of two sets
	 * @param b1
	 * @param b2
	 * @return the result
	 */
	public static BinarySearchTree union(BinarySearchTree b1,BinarySearchTree b2){
		unionTreeNode(b1.root);
		unionTreeNode(b2.root);
		return unionResult;
	}

	/**
	 * add set t to the result
	 * @param t the first element in the set
	 */
	private static void unionTreeNode(TreeNode t){
		if (t != null){
			add(unionResult,t.item);
			if (t.left != null){
				unionTreeNode(t.left);
			}
			if (t.right != null){
				unionTreeNode(t.right);
			}
		}

	}

	/**
	 * the difference of two sets
	 * @param b1
	 * @param b2
	 * @return the result
	 */
	public static BinarySearchTree difference(BinarySearchTree b1,BinarySearchTree b2){
		differenceTreeNode(b1.root,b2.root);
		return differenceResult;
	}

	/**
	 * the difference of two sets
	 * @param t1
	 * @param t2
	 */
	private static void differenceTreeNode(TreeNode t1,TreeNode t2){
		if (t1 != null){
			if (!isElement(t2,t1.item))
				add(differenceResult,t1.item);
			if (t1.left != null){
				differenceTreeNode(t1.left,t2);
			}
			if (t1.right != null){
				differenceTreeNode(t1.right,t2);
			}
		}

	}

	/**
	 * check set b1 is a subset of set b2 or not
	 * @param b1
	 * @param b2
	 * @return true if it is
	 */
	public static boolean isSubset(BinarySearchTree b1,BinarySearchTree b2){

		isSubsetTreeNode(b2.root,b1.root);
		return subsetResult;
	}

	/**
	 * check if set t1 is a subset of set t2,the result is stored in subsetResult
	 * @param t1
	 * @param t2
	 */
	private static void isSubsetTreeNode(TreeNode t1,TreeNode t2){
		if (t2 != null){
			if (!isElement(t1,t2.item)){
				subsetResult = false;
				return;
			}
			if (t2.left != null){
				isSubsetTreeNode(t1,t2.left);
			}
			if (t2.right != null){
				isSubsetTreeNode(t1,t2.right);
			}
		}

	}
	/**
	 * generate 100 random number from 0 to 49999
	 * @return a double array
	 */
	public static double[] randomNumber(){
		Random random = new Random();
		double[] result = new double[100];
		for (int i = 0;i < result.length;i++){
			result[i] = random.nextDouble()*49999;
		}
		return result;
	}

	/**
	 * get the height of the tree
	 * @param root the entrance of the tree
	 * @return the height
	 */
	public static int height(TreeNode root){
		if (root == null){
			return 0;
		}
		return Math.max(height(root.left),height(root.right)) + 1;
	}

	public static void main(String[] args) throws IOException {
		BinarySearchTree b1 = new BinarySearchTree();
		File file = new File("./int20k.txt");
		InputStream in = new FileInputStream(file);
		Scanner sc = new Scanner(in);
		while (sc.hasNext()){
			double temp = sc.nextDouble();
			add(b1,temp);
		}
		double[] d = randomNumber();
		long t1 = System.nanoTime();
//		for (int i = 0; i < d.length;i++){
//			isElement(b1.root,d[i]);
//		}
//		long t2 = System.nanoTime();
//		System.out.println((t2-t1) / 1000000. + " ms");
//		System.out.println(size(b1.root));
		System.out.println(height(b1.root));
	}


}
