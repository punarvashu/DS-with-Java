
public class BalancedParenthesis {
	char items[] = new char[5];
	int top = -1;

	void push(char data) {
		if (top == 99) {
			System.out.println("Stack full");
		} else {
			items[++top] = data;
		}
	}

	boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	public boolean isFull() {
		if (items.length == top) {
			return true;
		} else {
			return false;
		}
	}

	char pop() {
		if (top == -1) {
			System.out.println("Underflow error");
			return '\0';
		} else {
			char element = items[top];
			top--;
			return element;
		}
	}

	public void peek() {
		int data;
		data = items[top - 1];
		System.out.println(data + " is at top of Stack ");
	}

	public void size() {
		System.out.println("size of stack is " + top);
	}

	public void show() {
		for (int n : items) {
			System.out.println(n + " ");

		}
	}

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	boolean areParenthesisBalanced(char exp[]) {
		BalancedParenthesis BP = new BalancedParenthesis();

		for (int i = 0; i < exp.length; i++) {

			if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
				BP.push(exp[i]);

			if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

				if (BP.isEmpty()) {
					return false;
				}

				else if (!isMatchingPair(BP.pop(), exp[i])) {
					return false;
				}
			}

		}

		if (BP.isEmpty())
			return true;
		else {
			return false;
		}
	}

}
