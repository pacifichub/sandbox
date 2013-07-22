package com.sandbox.datastructures.stack;



public class Stack<T> {
	
	private class Node{
		private T data;
		private Node next;
		
		Node(T data){
			this.data = data;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setNext(Node nextN){
			this.next = nextN;
		}
		
	}

	Node top;
	int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public void push(T t){
		Node newNode = new Node(t);
		if(top == null)
			top = newNode;
		else{
			newNode.setNext(top);
			top = newNode;
		}
		size++;
	}
	
	public T pop(){
		if(size == 0){
			throw new UnsupportedOperationException();
		}
		
		T t = top.data;
		top = top.getNext();
		size--;
		return t;
	}
	
	@Override
	public String toString() {
		Node current = top;
		String s = "";
		while(current != null){
			if(s.length() == 0){
				s = current.data.toString();
			}else{
				s += "->"+current.data.toString();
			}
			
			current = current.getNext();
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		myStack.push("a");
		myStack.push("b");
		System.out.println("Stack.main() "+myStack.toString());
		System.out.println("Stack.main() Pop "+myStack.pop());
		System.out.println("Stack.main() Pop "+myStack.pop());
		System.out.println("Stack.main() Pop "+myStack.pop());
		
	}
	
	
}
