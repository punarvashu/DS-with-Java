
public class StackRunner {
	public static void main(String[] args) {
		Stack nums = new Stack();
//		System.out.println("Empty = " + nums.isEmpty());
		nums.push(10);
		nums.push(20);
		nums.push(30);
		nums.push(40);
		nums.push(50);
		nums.pop();
		nums.peek();
		nums.size();
		System.out.println("Empty = " + nums.isEmpty());
		nums.show();
	}

}
