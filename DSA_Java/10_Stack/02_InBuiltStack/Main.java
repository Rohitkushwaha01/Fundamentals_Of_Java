import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adding Elements in Stack
        for (int i = 1; i <= 5; i++) {
            stack.add(i);
        }

        // Displaying all the elements of the stack
        System.out.println(stack);

        // removing the top element from the stack
        System.out.println(stack.pop());

        // Displaying all the elements of the stack
        System.out.println(stack);

        // Displaying the top element of stack
        System.out.println(stack.peek());
    }
}
