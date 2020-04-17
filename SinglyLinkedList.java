
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
public void insertAtStart(int data)
{
	Node node = new Node();
	node.data = data;
	node.next = null;
	node.next = first;
	first = node;
	System.out.println(" " + node.data);
}
public void insertAt(int index,int data)
{
	Node node = new Node();
	node.data = data;
	node.next = null;
	
	if(index==0)
	{
		if (this.first == null) {
			System.out.println("No node is available.");
			return;
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
}
