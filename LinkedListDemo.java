package dsa.linkedlists;

public class LinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);
		dll.display();
		System.out.println("Size: " + dll.getSize());
//		dll.remove(40);
//		dll.removeAt(3);
//		dll.display();
//		dll.displayInReverse();
//		dll.insertAt(3,70);
		
	}

}
