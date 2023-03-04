import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding Elements in Queue
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        // Displaying all the elements of the queue
        System.out.println(queue);

        // removing the top element from the queue
        System.out.println(queue.remove());

        // Displaying all the elements of the queue
        System.out.println(queue);

        // Displaying the top element of queue
        System.out.println(queue.peek());
    }
}
