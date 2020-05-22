
public class ParenthesisMain {
	public static void main(String[] args) {
		BalancedParenthesis BP = new BalancedParenthesis();
		System.out.println("Empty = " + BP.isEmpty());
		System.out.println("Full = " + BP.isFull());
		char exp[] = { '{', '(', ')', '}', '[',  };
		if (BP.areParenthesisBalanced(exp))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
