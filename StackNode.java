
public class StackNode {
	public int data;
	public Node next;

	public StackNode() {
		super();
		this.next = null;
	}

	public StackNode(int data) {
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

}
