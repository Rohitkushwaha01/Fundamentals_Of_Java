
public class CLL {
    
    private Node head;
    private Node tail;

    public CLL(){
        head = null;
        tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head != null){
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node != head);
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
