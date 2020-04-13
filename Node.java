package dsa.linkedlists;

public class Node {
	public int data;
	public Node next;
	public Node prev;

	public Node() {
		super();
		this.next = null;
		this.prev = null;
	}

	public Node(int data) {
		this();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getLast() {
		return prev;
	}

	public void setLast(Node prev) {
		this.prev = prev;
	}

}