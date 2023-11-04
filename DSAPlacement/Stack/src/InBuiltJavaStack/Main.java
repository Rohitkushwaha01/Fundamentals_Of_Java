package InBuiltJavaStack;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(53);
		stack.push(54);
		stack.push(4);
		stack.push(34);
		stack.pop();
		stack.pop();
	
		System.out.println(stack.peek());
		System.out.println(stack);
	}

}
