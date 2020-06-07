
public class QueueLinkedList {
	private Node front;
	private Node rear;

	public QueueLinkedList() {
		super();
		this.front = null;
		this.rear = null;

	}

	private Node _createNode(int data) {
		return new Node(data);
	}

	public Node getFirst() {
		return front;
	}

	public void setFirst(Node first) {
		this.front = first;
	}

	public Node getLast() {
		return rear;
	}

	public void setLast(Node last) {
		this.rear = last;
	}

	public void enQueue(int data) {
		Node temp = this._createNode(data);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		} else {
			this.rear.next = temp;
			this.rear = temp;
		}
	}
}