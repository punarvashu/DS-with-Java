public class DoublyLinkedList {

	private Node first;
	private Node last;

	public DoublyLinkedList() {
		super();
		this.first = null;
		this.last = null;
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
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
		}
	}

	public void displayInReverse() {
		if (this.last == null) {
			System.out.println("No node is available");
			return;
		} else {
			Node currentNode = last;
			while (currentNode != null) {
				System.out.println(currentNode.data + " ");
				currentNode = currentNode.prev;
			}
		}
	}

	public void remove(int value) {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		} else {
			Node currentNode = first;
			while (currentNode != null) {
				if (currentNode.data == value) {
					if (currentNode == first) {
						first = first.next;
						first.prev = null;
						System.out.println("First Node removed");
						break;
					} else if (currentNode == last) {
						last = last.prev;
						last.next = null;
						System.out.println("last node is removed");
						break;
					} else {
						currentNode.prev.next = currentNode.next;
						currentNode.next.prev = currentNode.prev;
						System.out.println("node in between is removed");
						break;

					}
				}
				currentNode = currentNode.next;
			}
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
					first.prev = null;
					System.out.println("First Node removed");
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
			Node currentNode = last;
			while (currentNode != null) {
				if (currentNode == last) {
					last = last.prev;
					last.next = null;
					System.out.println("last node is removed");
					break;
				}
			}
		}
	}

	public void removeAt(int index) {
		if (index == 0) {
			first = first.next;
		} else {
			Node n = first;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	public void insertAtBeginning(int data) {
		Node node = this._createNode(data);
		node.next = first;
		first = node;
	}

	public void insertAt(int index, int data) {
		if (this.first == null) {
			System.out.println("list is empty");
			System.exit(1);
		}
			else if(index<1) {
				System.out.println("illigal input");
			}else {
	
		Node node = this._createNode(data);
		Node current = first;
	
		for (int f = 1; f < index-1; f++) {
			current = current.next;
		}
		
		node.next = current.next;
		current.next.prev = node;
		current.next = node;
		node.prev = current;
		
	}

	private int computeSize() {
		int retval = 0;
		Node current = first;
		while(current != null) {
			retval += 1;
			current = current.next;
		}
		return retval;
	}
	
	public void insertAtEnd(int data) {
		Node new_node = new Node(data);
		/* If the Linked List is empty, then make the new node as head */
		if (first == null) {
			first = new Node(data);
			return;
		}

		/* This new node is going to be the last node, so make next of it as null */

		new_node.next = null;

		/* Else traverse till the last node */
		Node last = first;
		while (last.next != null)
			last = last.next;

		/* Change the next of last node */
		last.next = new_node;
		this.computeSize();
		System.out.println("size of list is" + computeSize());
	}
}
