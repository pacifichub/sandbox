package com.sandbox.datastructures.linkedlist;


public class SLL {

	private Node startnode;
	
	public SLL(Node start) {
		this.startnode = start;
	}
	
	public void addFirst(String data){
		if(data == null)
			return;
		
		Node newNode = new Node(data);
		this.startnode = newNode;
	}
	
	public void addLast(String data){
		if(data == null)
			return;
		
		Node newLastNode = new Node(data);
		Node lastNode = this.startnode;
		while(lastNode.getNextNode() != null){
			lastNode = lastNode.getNextNode();
		}
		
		lastNode.setNext(newLastNode);
	}
	
	public boolean delete(Object dataToDelete){
		// To delete, first traverse the linked list to find the item
		boolean isDeleted = false;
		Node prev = null;
		Node next = this.startnode;
		while(next != null){
			if(next.getData() == dataToDelete){
				// If there is only 1 element in the list and that is the one to be deleted
				if(next == this.startnode && next.getNextNode() == null) {
					this.startnode = null;
				}else if(next.getNextNode() == null){ // If the last element in the list is to be deleted
					prev.setNext(null);
				}else{
					if(prev == null) // we are deleting the first elemet
					{
						this.startnode = next.getNextNode();
					}else{						
						prev.setNext(next.getNextNode());
					}
				}
				
				isDeleted = true;
				break;
			}
			
			prev = next;
			next = prev.getNextNode();
		}
		
		return isDeleted;
	}
	
	public void deleteDuplicates(){
		if(this.startnode == null)
			return;
		
		Node prev = this.startnode;
		Node current = this.startnode.getNextNode();
		
		
		while(current != null){
			Node runner = this.startnode;
			
			while(runner != current){
				if(runner.getData() == current.getData()){
					Node temp = current.getNextNode();
					prev.setNext(temp);
					current = temp;
					break;
				}
				
				runner = runner.getNextNode();
			}
				
			if(runner == current){
				prev = current;
				current = current.getNextNode();
			}
		}
	}
	
	@Override
	public String toString() {
		if(this.startnode == null){
			return "";
		}
		return this.startnode.toString();
	}
	
	public Node reverseWithRecursion(Node startNodeList){
		Node reversed = null;
		
		if(startNodeList == null)
			reversed = null;
		// Only 1 element
		else if(startNodeList.getNextNode() == null)
			reversed = startNodeList;
		
		else
		{
			Node next = startNodeList.getNextNode();
			startNodeList.setNext(null);
			Node reversedNode = reverseWithRecursion(next);
			next.setNext(startNodeList);
			reversed = reversedNode;
			
		}
		
		char i = 'a' + 'b';
		
		
		return reversed;
		
	}
	
	public Node deleteWithRecursion(Object dataToDelete, Node node){
		if(node.getData().equals(dataToDelete)){
			return node.getNextNode();
		}else{
			node.setNext(deleteWithRecursion(dataToDelete, node.getNextNode()));
			return node;
		}
	}
	
	public Node reverseWithoutRecursion(Node startNodeList){
		Node prev = null;
		Node temp = null;
		while(startNodeList != null){
			temp = startNodeList.getNextNode();
			startNodeList.setNext(prev);
			prev = startNodeList;
			startNodeList = temp;
		}
		
		return prev;
	}
	
	public Node findKthElementFromEnd(int k)
    {
		Node current = this.startnode;//current node
		Node currentK = this.startnode;//node at index k

        int counter = 0;

        while(current.getNextNode()!=null)
        {
            counter++;

            if(counter>=k)
            {
                currentK = currentK.getNextNode();
            }

            current = current.getNextNode();
        }

        //reached end
        return currentK;
    }
	
	public static void main(String[] args) {
		SLL sll = new SLL(new Node("1"));
		sll.addFirst("2");
		sll.addFirst("3");
		sll.addFirst("4");
		sll.addFirst("5");
		sll.addFirst("4");
		sll.addLast("6");
		System.out.println("SLL.main() "+sll.toString());
		System.out.println("SLL.main() Kth Element "+sll.findKthElementFromEnd(2));
//		sll.deleteDuplicates();
//		System.out.println("SLL.main() After Duplicate Cleanup "+sll.toString());
//		System.out.println("SLL.main() deleteing 3: "+sll.delete(3));
//		System.out.println("SLL.main() "+sll.toString());
//		System.out.println("SLL.main() deleteing 55: "+sll.delete(55));
//		System.out.println("SLL.main() "+sll.toString());
//		System.out.println("SLL.main() deleteing 5: "+sll.delete(5));
//		System.out.println("SLL.main() "+sll.toString());
//		System.out.println("SLL.main() deleteing 6: "+sll.delete(6));
//		System.out.println("SLL.main() deleteing 6: "+sll.deleteWithRecursion(1, sll.startnode));
//		System.out.println("SLL.main() "+sll.toString());
//		
//		System.out.println("SLL.main() "+sll.reverseWithRecursion(sll.startnode));
//		System.out.println("SLL.main()"+sll.reverseWithoutRecursion(sll.startnode));
		
		StringBuilder s = new StringBuilder();
		s.append('a');
		s.append('b');
		System.out.println("SLL.enclosing_method()"+s.toString());
	}
	
	
}
 
