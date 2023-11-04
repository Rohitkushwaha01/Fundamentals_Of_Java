package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DLL list = new DLL();

		list.insertFirst(7);
		list.insertFirst(0);
//		list.insertFirst(4);
//		list.insertFirst(9);
//		
//		list.insertLast(5);
//		
//		list.insert(10,0);
		list.display();
		System.out.println(list.delelteFirst());
		list.display();
		System.out.println(list.delelteLast());
		list.display();
//		list.displayReverse();
//		System.out.print(list.getSize());
	}

}
