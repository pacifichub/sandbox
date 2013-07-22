package com.sandbox.datastructures.BST;

public class Traversal {
	
	BinarySearchTree bst = null;
	
	public Traversal(BinarySearchTree treeToTraverse) {
		this.bst = treeToTraverse;
	}
	
	public void inorderTraversal(){
		inorderTraversal(bst.root);
	}

	/*
	 *  1.  Go the left subtree, and perform an inorder traversal on that node.

		2.  Print out the value of the current node.

		3.  Go to the right child node, and then perform an inorder traversal on that right child node's subtree.

	 */
	private void inorderTraversal(Node node){
		if(node == null)
			return;
		
		if(node.left != null){
			inorderTraversal(node.left);
		}
		
		System.out.println(node.data);
		
		if(node.right != null){
			inorderTraversal(node.right);
		}
	}
	
	public void preorderTraversal(){
		preorderTraversal(bst.root);
	}
	
	/*
	 * 1.  Print out the root's value, regardless of whether you are at the actual root or just the subtree's root.

		2.  Go to the left child node, and then perform a pre-order traversal on that left child node's subtree.

		3.  Go to the right child node, and then perform a pre-order traversal on that right child node's subtree.

		4.  Do this recursively.
	 */
	
	private void preorderTraversal(Node node){
		if(node == null)
			return;
		
		System.out.println(node.data);
		
		if(node.left != null)
			preorderTraversal(node.left);
		
		if(node.right != null)
			preorderTraversal(node.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(new Node(2));
		Traversal t = new Traversal(bst);
		try {
			bst.insert(7);
			bst.insert(6);
			bst.insert(5);
			bst.insert(9);
			System.out.println("Traversal.main() "+bst.toString());
			t.inorderTraversal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
