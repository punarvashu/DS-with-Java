
public class QueueMain {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(7);
		q.enQueue(18);
		q.enQueue(45);
		q.enQueue(10);
		q.enQueue(8);
		
		q.deQueue();
//		q.deQueue();
		
		q.enQueue(1);
		q.enQueue(2);
		
//		q.size();
		
//		System.out.println("Empty " + q.isEmpty());
		
//		System.out.println("Full " + q.isFull());
		
		q.show();
	}
}
