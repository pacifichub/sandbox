package com.sandbox.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.sandbox.datastructures.linkedlist.LinkedList;

public class Collections {
	
	
	
	public static void main(String[] args) {
		// Extend Collections Interface
		
		// SET
		
		
		// LIST
		List<String> arrayL = new ArrayList<String>();
		arrayL.add("A");
		arrayL.add("B");
		arrayL.add("C");
		
		System.out.println("Collections.main() ArrayList : "+arrayL.toString());
		
		List<String> stackL = new Stack<String>();
		stackL.add("A");
		stackL.add("B");
		stackL.add("C");
		
		System.out.println("Collections.main() Stack : "+stackL.toString());
		
		List<String> vectorL = new Vector<String>();
		vectorL.add("A");
		vectorL.add("B");
		vectorL.add("C");
		
		System.out.println("Collections.main() Vector : "+vectorL.toString());
		
		List<String> linkedL = new java.util.LinkedList<String>();
		linkedL.add("A");
		linkedL.add("B");
		linkedL.add("C");
		
		System.out.println("Collections.main() LinkedList : "+linkedL.toString());
		
		
		// QUEUE
	}

	
	
}
