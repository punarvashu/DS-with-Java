
public class SinglyRunner {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		sll.addNode(10);
		sll.addNode(20);
		sll.addNode(30);
		sll.addNode(40);
		sll.addNode(50);
		sll.display();
    	        System.out.println();
//		sll.removeFirstNode();
//		sll.removeLastNode();
//		sll.removeAt(3);
//		sll.remove(40);
//		sll.display();
//		sll.displayInReverse();
		sll.insertAtStart(25);
		sll.insertAt(3,70);
//		sll.insertAtEnd(60);
//		sll.search(20);
		sll.display();
		
	}

}

