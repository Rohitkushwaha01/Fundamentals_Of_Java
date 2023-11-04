package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		LL list = new LL();
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.display();
		
		list.insert(5, 1);
		list.display();
		
		list.delete(3);
		list.display();
	}

}
