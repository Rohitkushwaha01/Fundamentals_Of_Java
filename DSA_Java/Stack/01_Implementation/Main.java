import java.util.Stack;

public class Main{
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);

        System.out.println(stack.push(4));
        System.out.println(stack.push(40));
        System.out.println(stack.push(74));
        System.out.println(stack.push(49));
        System.out.println(stack.push(44));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}

