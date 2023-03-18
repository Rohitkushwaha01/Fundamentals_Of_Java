class LinkedList{
    // Used data type as node because it will point to Node box
    Node head;
    Node tail;
    // this will maintain the size of linked list;
    int size = 0;

    // Creating Node template
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    // Inserting at first
    public void insertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    // Inserting at last
    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
        size++;
    }

    // Inserting after a particular value
    public void insertAfter(int val, int value){
        Node traverse;
        traverse = head;
        while(traverse != null){
            if(traverse.data == val){
                System.out.println("exists");
                Node newNode = new Node(value);
                newNode.next = traverse.next;
                traverse.next = newNode;
                size++;
                return;
            }else{
                System.out.println("Not exists!!");
                traverse = traverse.next;
            }
        }   
    }

    // Deleting the first element of the List
    public void deleteFirst(){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        head = head.next;
        size--;
        return;
    }

    // Deleting the last element of the List
    public void deleteLast(){
        if(head == null){
            return;
        }
        System.out.println(tail.data);
        tail = get(size - 2);
        tail.next = null;
        size--;
    }

    // Deleting at the particular index
    public void delete(int index){
        if(index < 1){
            deleteFirst();
            return;
        }

        if(size == index){
            deleteLast();
            return;
        }

        Node newPrevNode = get(index-1);
        Node newNode = get(index);
        newPrevNode.next = newNode.next;
        size--;
    }

    // Get function: To get the particular node int the list
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display all the elements in the linked list
    public void display(){
        Node traverse;
        traverse = head;
        while(traverse != null){
            System.out.print(traverse.data + " -> ");
            traverse = traverse.next;
        }
        System.out.println("End");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFirst(2);
        list.insertAtFirst(4);
        list.insertAtFirst(7);
        list.insertAtLast(5);
        list.insertAtLast(18);
        list.insertAfter(12, 10);
        list.display();
        list.delete(4);
        list.display();
    }
}
