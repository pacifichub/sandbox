package com.sandbox.datastructures.linkedlist;

public class Node {
	
	String data;
	Node nextNode;
	
	public Node(String data) {
		this.nextNode = null;
		this.data = data;
	}
	
	public Node(String data, Node nextN){
		this.data = data;
		this.nextNode = nextN;
	}

	public String getData() {
		return data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
		
	}
	
	@Override
	public String toString() {
		if(nextNode == null){
			return this.data+"->"+"End";
		}else{
			return this.data+"->"+this.nextNode.toString();
		}
		
	}
	

}
