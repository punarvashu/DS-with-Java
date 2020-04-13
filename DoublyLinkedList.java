package dsa.linkedlists;

import javax.xml.soap.Node;

public class DoublyLinkedList {

	private Node first;
	private Node last;
	private int numberOfNodes;

	public DoublyLinkedList() {
		super();
		this.first = null;
		this.last = null;
		numberOfNodes = 0;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public void addNode(int data) {
		if (this.first == null) {
			Node node = this._createNode(data);
			first = node;
			last = node;
		} else {
			Node node = this._createNode(data);
			if (last.getNext() == null) {
				last.next = node;
				node.prev = last;
				last = last.next; // or last = node;
			} else {
				System.exit(1);
			}

		}
	}

	private Node _createNode(int data) {
		return new Node(data);
	}

	public void display() {
		if (this.first == null) {
			System.out.println("No node is available.");
			return;
		} else {
			Node currentNode = first;
			while (currentNode != null) {
				numberOfNodes += 1;
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			if (this.last==null) {
		       System.out.print("No node is available.");
		       return;
			}else {
	         Node currentNode= last;
	         while (currentNode != null) {
	        	 numberOfNodes -=1;
	        	 System.out.println(currentNode.data + " ");
	        	 currentNode=currentNode.prev;
	         }
			}
			
	
	public int getSize(){
		return this.numberOfNodes;
	}
}


/**
null|10|BBB <--> AAA|20|null <--> null|30|null
AAA				  BBB				CCC

1000: first-->AAA
2000: last -->BBB

**/
