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
		if(this.last==null) {
			System.out.println("No node is available");
			return;
		}else {
			Node currentNode=last;
			while(currentNode !=null) {
				System.out.println(currentNode.data + " ");
				currentNode=currentNode.prev;
			}
		}
	}
	public void remove(int value) {
		if(this.first==null) {
			System.out.println("list is empty");
			System.exit(1);
		}else {
			Node currentNode=first;
			while (currentNode !=null) {
				if(currentNode.data==value) {
					if(currentNode==first) {
						first=first.next;
						first.prev=null;
						System.out.println("First Node removed");
						break;
					}else if(currentNode==last) {
						last=last.prev;
						last.next=null;
						System.out.println("last node is removed");
						break;
					}else {
						currentNode.prev.next=currentNode.next;
						currentNode.next.prev=currentNode.prev;
						System.out.println("node in between is removed");
						break;
						
					}
				}
				currentNode=currentNode.next;
			}
		}
	}
	public void search(int value) {
		if(this.first==null) {
			System.out.println("list is empty");
			System.exit(1);
		}else {
			Node currentNode=first;
			while(currentNode !=null) {
				last=last.next;
				if(currentNode.data==value) {
					System.out.println("Value is present");
				}else {
					System.out.println("Value is not present in the list");
				}break;
			}
		}
	}
    public void removeAt(int value) {
	if(value==0) {
		first=first.next;
	}else {
		Node currentNode=first;
		Node current=null;
		for(int i=0;i<value-1;i++)
		{
			currentNode=currentNode.next;
		}
	current=currentNode.next;
	currentNode.next=current.next;
	System.out.println("node is removed "+current.data);
	}
    }	

public void insertAt(int value,int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(value==0) {
			first=first.next;
		}
	Node current=first;
	for(int i=0; i<value-1 ;i++) {
		current=current.next;
	}
	node.next=current.next;
	current.next=node;
}
}
/**
null|10|BBB <--> AAA|20|null <--> null|30|null
AAA				  BBB				CCC

1000: first-->AAA
2000: last -->BBB

**/
