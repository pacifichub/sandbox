package com.sandbox.datastructures.linkedlist;

public class LinkedList {
	Node startNode;
	
	public LinkedList(Node startN){
		this.startNode = startN;
	}
	public void addFirst(String data){
		Node newNode = new Node(data, startNode);
		startNode = newNode;
	}
	
	public void addLast(String data){
		Node newNode = new Node(data, null);
		
		if(startNode == null)
			this.startNode = newNode;
		
		Node current = startNode;
		while(current.getNextNode() != null){
			current = current.getNextNode();
		}
		
		if(current != null)
			current.setNext(newNode);
	}
	
	public static Node reverseWithRecursion(Node startN){
		Node reversed = null;
		
		if(startN == null)
			return null;
		else if(startN.getNextNode() == null)
			return startN;
		else
		{
			Node nextNode = startN.getNextNode();
			Node reversedNode = reverseWithRecursion(nextNode);
			startN.setNext(null);
			nextNode.setNext(startN);
			return reversedNode;
		}
		
	}
	
	public static Node reverseWithoutRecursion(Node startN){
		Node prev = null;
		Node temp = null;
		
		while(startN != null){
			temp = startN.nextNode;
			startN.setNext(prev);
			prev = startN;
			startN = temp;
		}
		
		return prev;
	}
	
	public static Node findMiddleOfLinkedList(Node startN){
		Node current = startN;
		Node oneAhead = startN;
		
		while(oneAhead != null){
			if(oneAhead.getNextNode() == null)
				break;
			else
			{
				oneAhead = oneAhead.getNextNode().getNextNode();
				current = current.getNextNode();
			}
		}
		
		return current;
	}
	
	public Node findKthElementFromEnd(int k){
		Node current = startNode;
		Node currentK = startNode;
		
		int counter = 0;
		
		while(current.getNextNode() != null){
			counter++;
			if(counter >= k){
				currentK = currentK.getNextNode();
			}
			current = current.getNextNode();
		}
		
		return currentK;
	}
	
	public void delete(String dataToBeDeleted){
		Node prev = null;
		Node current = startNode;
		while(current != null){
			if(current.getData().equals(dataToBeDeleted)){
				if(prev == null){// First node has to be deleted
					if(startNode.getNextNode() == null){
						startNode = null;
					}else{
						startNode = startNode.getNextNode();
					}
				}else if(current.getNextNode() == null){
					prev.setNext(null);
				}else{
					prev.setNext(current.getNextNode());
				}
				break;
			}
			else{
				prev = current;
				current = current.getNextNode();
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		if(startNode == null)
			return "";
		else
			return startNode.toString();
	}
	
	public static void main(String[] args) {
		Node newNode = new Node("5");
		LinkedList ll = new LinkedList(newNode);
//		System.out.println("LinkedList.main() Add StartNode 5: "+ll.toString());
		ll.addFirst("6");
		ll.addFirst("8");
		ll.addFirst("4");
		ll.addFirst("1");
		ll.addFirst("9");
		System.out.println("LinkedList.main() Add NewNode 6: "+ll.toString());
		
		System.out.println("LinkedList.main() "+ll.findKthElementFromEnd(3));
		
//		LinkedList addLastList = new LinkedList(new Node("5"));
//		addLastList.addLast("8");
//		addLastList.addLast("4");
//
//		System.out.println("LinkedList.main() Add Last 8: "+addLastList.toString());
//		
//		System.out.println("LinkedList.main() Middle Element : "+findMiddleOfLinkedList(addLastList.startNode));
//		Node reverseWithRecursion = reverseWithRecursion(addLastList.startNode);
//		System.out.println("LinkedList.main() Reversed : "+reverseWithRecursion.toString());
//		
//		addLastList.addLast("8");
//		addLastList.addLast("4");
//		System.out.println("LinkedList.main() Before Delete 8: "+addLastList.toString());
//		addLastList.delete("4");
//		System.out.println("LinkedList.main() Delete 8: "+addLastList.toString());
		
	}

}
