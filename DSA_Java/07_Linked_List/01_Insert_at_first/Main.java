// Linked list: insert at first.

public class Main{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // inserting at first

    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node curNode = head;

        while(curNode != null){
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {
        Main list = new Main();

        list.addFirst("Kushwaha");
        list.addFirst("Pooja");
        list.addFirst("Kushwaha");
        list.addFirst("Rohit");

        list.printList();
    }
}