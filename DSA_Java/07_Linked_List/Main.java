public class Main{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtLast(9);
        list.insertAtFirst(3);
        list.insertAtFirst(35);
        list.insertAtFirst(37);
        list.insertAtFirst(5);
        list.insertAtFirst(84);
        list.display();
        System.out.println();
        list.insertAtFirst(54);
        list.insertAtLast(4);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteFirst());
        list.display();
    }
}

