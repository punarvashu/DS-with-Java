
public class StackUsingLinkedList {
	private Node top;
	private Node last;

	public StackUsingLinkedList() {
		super();
		this.top = null;
		this.last = null;

	}

	private Node _createNode(int data) {
		return new Node(data);
	}

	public Node getFirst() {
		return top;
	}

	public void setFirst(Node first) {
		this.top = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public void push(int data) {
		Node temp = this._createNode(data);
		if (temp == null) {
			System.out.println("Stack is full");
		} else {
			temp.data = data;
			temp.next = top;
			top = temp;
		}
	}

	public void display() {
		if (top == null) {
			System.out.println("Stack Underflow");
			System.exit(1);
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

}
