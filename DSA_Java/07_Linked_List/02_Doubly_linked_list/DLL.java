public class DLL{

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node last = head;
        Node node = new Node(val);
        while(last.next != null){
            last = last.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;
        System.out.println(last);
    }

    public void insert(int val, int after){
        Node prevNode = findNode(after);
        if(prevNode == null) {
            System.out.println("Does not exsits");
            return;
        }
        Node node = new Node(val);
        node.prev = prevNode;
        node.next = prevNode.next;
        prevNode.next = node;
        if(node.next == null){
            return;
        }
        node.next.prev = node;
    }

    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void displayReverse(){
        Node node = head;

        if(node == null){
            return;
        }

        while(node.next != null){
            node = node.next;
        }
        while(node != null){
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }

    
}