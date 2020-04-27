
public class Stack {
	int stack[] = new int [5];
	int count = 0;
	
	public void push(int data) {
		stack [count] = data;
		count++ ;
	}
	public void pop() {
		int data;
		count-- ;
	    data = stack[count];
		stack[count] = 0;
		System.out.println(data + " is poped out from stack ");
	}
	public void peek() {
		int data;
		data = stack[count-1];
		System.out.println(data + " is at top of Stack ");
	}
	public void size() {
		System.out.println("size of stack is " + count);
	}
	public boolean isEmpty() {
		return count<=0;
	}
	public void show() {
		for(int n : stack) {
			System.out.println(n + " ");
		}
	}

}
