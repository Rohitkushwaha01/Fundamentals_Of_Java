// Linked List can be defined as collection of objects called nodes that are randomly stored in the memory.
// A node contains two fields i.e. data stored at that particular address and the pointer which contains the address of the next node in the memory.
// The last node of the list contains pointer to the null.


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        // Adding values in the linked list.
        list.add("Rohit");
        list.add("Pooja");
        list.add("Pankaj");
        list.add("Gaurav");
        System.out.println(list);

        // Adding at the first.
        list.addFirst("Sahil");

        // Adding at the last
        list.addLast("Shubham");
        System.out.println(list);

        // remove first element
        list.removeFirst();

        // remove last element
        list.removeLast();

        System.out.println(list);

    }
}
