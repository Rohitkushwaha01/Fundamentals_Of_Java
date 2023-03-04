public class Main{
    public static void main(String[] args) throws Exception  {
        CustomQueue queue = new CustomQueue();

        System.out.println(queue.insert(8));
        System.out.println(queue.insert(80));
        System.out.println(queue.insert(30));
        System.out.println(queue.insert(50));
        System.out.println(queue.insert(74));
        System.out.println(queue.insert(75));
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

    }
}