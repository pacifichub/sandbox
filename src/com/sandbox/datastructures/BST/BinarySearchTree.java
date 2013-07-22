package com.sandbox.datastructures.BST;

public class BinarySearchTree {
	
	 public BinarySearchTree(Node root) {
		 this.root = root;

	 }

	Node root;
	
	public boolean lookup(Integer dataToLookup){
		return lookup(root, dataToLookup);
	}
	
	public boolean lookup(Node node, Integer dataToLookup){
		if(node == null)
			return false;
		else if(node.getData().compareTo(dataToLookup) == 0)
			return true;
		else if(node.getData().compareTo(dataToLookup) > 0){
			return lookup(node.getLeft(), dataToLookup);
		}else{
			return lookup(node.getRight(), dataToLookup);
		}
	}
	
	public void insert(Integer dataToInsert) throws Exception{
		insert(root, dataToInsert);
	}
	
	public Node insert(Node node, Integer dataToInsert) throws Exception{
		if(node == null){
			node = new Node(dataToInsert);
		}
		else if(node.getData() == dataToInsert){
			throw new Exception("DuplicateData");
		}else if(node.getData().compareTo(dataToInsert) > 0){
			node.left = insert(node.left, dataToInsert);
		}else if(node.getData().compareTo(dataToInsert) < 0){
			node.right = insert(node.right, dataToInsert);
					
		}
		
		return node;
	}
	
	public Node remove(Integer dataToRemove){
		if(root == null)
			return null;
		else if(root.data.compareTo(dataToRemove) == 0){
			Node newNode = new Node(0);
			newNode.left = root;
			Node removedNode = remove(newNode, root.data);
			root = newNode.left;
			return removedNode;
		}else{			
			return remove(root, dataToRemove);
		}
	}
	
	private Node remove(Node node, Integer dataToRemove) {
		if(node == null){
			return null;
		}
		else if(node.data.compareTo(dataToRemove) > 0){
			node.left = remove(node.left, dataToRemove);
		}
		else if(node.data.compareTo(dataToRemove) < 0){
			node.right = remove(node.right, dataToRemove);
		}
		else{ // Found the node
			// Case 1: Node has both left and right children 
			// Replace nodeToBeRemoved with the minimum element from right subtree
			if(node.left != null && node.right != null){
				Node rightSubTreeMinNode = findMinimum(node.right);
				node.data = rightSubTreeMinNode.data;
				remove(node.right, node.data);
			}else if(node.left == null){
				node = (node.left != null) ? node.left : node.right;
				
			}
		}
		return node;
	}

	public Node findMinimum(){
		return findMinimum(root);
	}
	
	public Node findMinimum(Node node){
		if(node == null)
			return null;
		
		while(node.left != null){
			node = node.left; 
		}
		return node;
	}
	
	public int height(){
		return height(root);
	}
	
	public int height(Node node){
		if(node == null)
			return 0;
		
		int hLeft = height(node.left);
		int hRight = height(node.right);
		return (hLeft > hRight) ? (hLeft + 1) : (hRight + 1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return root.toString();
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(20);
		BinarySearchTree bst = new BinarySearchTree(n1);
		
		try {
			bst.insert(10);
			bst.insert(30);
		
		
		System.out.println(bst.toString());
		System.out.println("BinarySearchTree.main() Min : "+bst.findMinimum());
		
		bst.insert(35);
		bst.insert(15);
//		
		System.out.println("BinarySearchTree.main() Insert 35 and 15 : "+bst.toString());
		System.out.println("BinarySearchTree.main() Height "+bst.height());
		System.out.println("BinarySearchTree.main()"+bst.remove(20).toString());
		System.out.println("BinarySearchTree.main() Remove 30 : "+bst.toString());
		
		
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
}
