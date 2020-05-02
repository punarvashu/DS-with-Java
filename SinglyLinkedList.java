
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
			for (int i = 1; i < index - 1; i++) {
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

	public void removeFirstNode() {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			Node currentNode = first;
			while (currentNode != null) {
				if (currentNode == first) {
					first = first.next;
					System.out.println("removed first node");
					break;
				}
			}
		}
	}

	public void removeLastNode() {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			Node node = first;
			while (node.next.next != null)
				node = node.next;
			node.next = null;
			System.out.println("last node is removed");

		}
	}

	private int computeSize() {
		int retval = 0;
		Node current = first;
		while (current != null) {
			retval += 1;
			current = current.next;
		}
		return retval;
	}

	public void insertAtEnd(int data) {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			Node node = this._createNode(data);
			if (first == null) {
				first = new Node(data);
				return;
			}

			node.next = null;

			Node last = first;
			while (last.next != null)
				last = last.next;

			last.next = node;
			this.computeSize();
			System.out.println("size of list is" + computeSize());
		}
	}

	public void remove(int value) {

		Node temp = first, prev = null;

		if (temp != null && temp.data == value) {
			first = temp.next;
			return;
		}

		while (temp != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;
	}

	public void displayInReverse() {
		Node n = first;
		Node prev = null;
		Node current = null;
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			while (n != null) {
				current = n;
				n = n.next;
				first = current;
				current.next = prev;
				prev = current;
				first = current;
			}
		}
	}
}

