public class Main{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(5);
        list.insertAtFirst(5);
        list.insertAtFirst(2);
        list.insertAtFirst(2);
        list.insertAtFirst(2);
        list.insertAtFirst(1);
        list.insertAtFirst(1);
        list.duplicates();
        list.display();
    }
}

