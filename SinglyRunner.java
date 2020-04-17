
public class SinglyRunner {

	public static void main(String[] args) {
		SinglyLinkedList dll = new SinglyLinkedList();
		
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);
		dll.display();
    	        System.out.println();
//		dll.removeFirstNode();
//		dll.removeLastNode();
//		dll.removeAt(3);
//		dll.remove(40);
//		dll.display();
//		dll.displayInReverse();
		dll.insertAtStart(25);
		dll.insertAt(3,70);
//		dll.insertAtEnd(60);
//		dll.search(20);
		dll.display();
		
	}

}

