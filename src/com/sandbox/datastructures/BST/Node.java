package com.sandbox.datastructures.BST;


public class Node{
	Node left;
	Node right;
	Integer data;
	
	public Node(Integer data) {
		this.data = data;
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		String s = "Me="+this.data;
		if(left != null)
			s += "\n *L="+this.left.toString();
		
		if(right != null)
			s += "\n\t^R="+this.right.toString();
		return s;
	}
	
	
}