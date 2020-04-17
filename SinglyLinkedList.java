
public class SinglyLinkedList {
	private Node first;
	private Node last;

	public SinglyLinkedList() {
		super();
		this.first = null;
		this.last = null;

	}

	private Node _createNode(int data) {
		return new Node(data);
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
				last = last.next; // or last = node;
			} else {
				System.exit(1);
			}

		}
	}

	public void display() {
		if (this.first == null) {
			System.out.println("No node is available.");
			return;
		} else {
			Node currentNode = first;
			while (currentNode != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = first;
		first = node;
	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (index == 0) {

			insertAtStart(data);
		} else {
			Node n = first;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void removeAt(int index) {
		if (this.first == null) {
			System.out.println("No node is available.");
			System.exit(1);
		} else {
			Node n = first;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			// System.out.println("n1 " + n1.data);
		}
	}

	public void search(int value) {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			boolean flag = false;
			Node currentNode = first;
			while (currentNode != null) {
				if (currentNode.data == value) {
					flag = true;
					break;
				}
				currentNode = currentNode.next;
			}
			if (!flag) {
				System.out.println("Value not found.");
			} else {
				System.out.println("Value is present");
			}
		}

	}

}
