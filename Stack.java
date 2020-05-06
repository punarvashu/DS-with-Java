
public class Stack {
	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top == 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public boolean isFull() {
		if (stack.length == top) {
			return true;
		} else {
			return false;
		}
	}

	public void pop() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			System.out.println(data + " is poped out from stack ");
		}
	}

	public void peek() {
		int data;
		data = stack[top - 1];
		System.out.println(data + " is at top of Stack ");
	}

	public void size() {
		System.out.println("size of stack is " + top);
	}

	public void show() {
		for (int n : stack) {
			System.out.println(n + " ");

		}
	}

}
