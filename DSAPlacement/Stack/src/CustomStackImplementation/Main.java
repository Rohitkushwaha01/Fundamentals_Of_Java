package CustomStackImplementation;

public class Main {

	public static void main(String[] args) {
		CustomStack stack = new CustomStack(5);
		
//		stack.push(93);
//		stack.push(10);
//		stack.push(43);
//		stack.push(20);
//		stack.push(53);
//		stack.push(538);
//		
		
		stack.pop();
		System.out.println(stack.peek());
		
		stack.display();
	}

}
