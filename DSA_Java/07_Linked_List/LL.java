public class LL {
    // Creating head and tail of class Nodes
    private Node head;
    private Node tail;
    // Size of LL
    private int size;

    // default constructor: size initialized to 0
    public LL() {
        this.size = 0;
    }

    // insertAtFirst method Insert element at the first
    public void insertAtFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // insertAtLast method Insert element at the last
    public void insertAtLast(int value) {
        if (tail == null) {
            insertAtFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // public void deleteLast(){
    //     int val = tail.value;
    //     Node temp = head;

    //     for (int i = 0; i < size - 1; i++) {
    //         
    //     }

    //     int val;

    // }

    // insert at given index
    public void insert(int value, int index) {
        if (index == 0) {
            insertAtFirst(value);
            return;
        }

        if (index == size) {
            insertAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    // size method returns the size of LL
    public int size() {
        return this.size;
    }

    // display method prints all the values of LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("end");
    }

    // Node class: structure of node.
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}