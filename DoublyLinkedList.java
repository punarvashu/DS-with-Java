
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
		}
	}
	
	public void displayInReverse() {
		if (this.first == null) {
			System.out.println("No node is available");
			return;
		} else {
			Node currentNode = last;
			while(currentNode != null) {
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
						System.out.println("First Node is removed");
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
			while(currentNode != null) {
				if (currentNode.data == value) {
					flag = true;
					break;
				}
				currentNode = currentNode.next;
			}
			if (flag) {
				System.out.println("Value not found.");	
			} else {
				System.out.println("Value is present");
			}
		}
	}
	
	public void removeFirstNode() {
		// to be implemented
	}
	
	public void removeLastNode() {
		// to be implemented
	}
		
	// this needs some more work, not acceptable.
	// first check if the linked list is there or not
	// then validate the pos/index to remove
	// have logical explanation for each line of code
    	public void removeAt(int index) {
		if(index==0) {
			first = first.next;
		}
		else
		{
			Node n = first;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}

	// this looks good now
	public void insertAtBeginning(int data) {
		Node node = this._createNode(data);
		node.next = first;
		first = node;
	}
	
	public void insertAtEnd(int data) {
		// to be implemented
	}
	
	// even this needs some more work, not acceptable
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else{
		Node n = first;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}
}
