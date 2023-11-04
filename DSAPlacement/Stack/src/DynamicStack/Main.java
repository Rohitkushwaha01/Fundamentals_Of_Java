package DynamicStack;

public class Main {

	public static void main(String[] args) {
		DynamicStack stack = new DynamicStack(3);
		
//		stack.push(0);
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(5);
		
		System.out.println(stack.pop());
		
		stack.display();

	}

}
