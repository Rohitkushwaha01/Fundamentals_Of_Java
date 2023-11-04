package DoublyLinkedList;

public class DLL {

	// Create a Node: prev + value + next
	public class Node{
		private int value;
		private Node prev;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		if(head == null) {
			head = node;
			size++;
			return;
		}
		
		head.prev = node;
		node.next = head;
		node.prev = null;
		head = node;
		size++;
	}
	
	public void insertLast(int val) {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		Node node = new Node(val);
		temp.next = node;
		node.prev = temp;
		node.next = null;
		size++;
	}
	
	public void insert(int val, int index) {
		
		if(index == 0) {
			insertFirst(val);
			return;
		}
		
		if(index == size) {
			insertLast(val);
			return;
		}
		
		Node node = new Node(val);		
		Node prevNode = getNode(index - 1);
		Node currNode = getNode(index);
		
		prevNode.next = node;
		node.next = currNode;
		size++;
		
	}
	
	public int delelteFirst() {
		int val = head.value;
		
		head = head.next;
		head.prev = null;
		if(head==null) tail = null;
		size--;
		return val;
	}
	
	public int delelteLast() {
//		if(getSize() == 1) {
//			return delelteFirst();
//		}
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		
		int val = temp.value;
		temp.prev.next = null;
		
		return val;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + "->");
			tail = temp;
			temp = temp.next;
		}
		System.out.println("End");
	}
	
	public void displayReverse() {
		Node temp = tail;
		while(temp !=null) {
			System.out.print(temp.value + "->");
			temp = temp.prev;
		}
		System.out.println("End");
	}
	
	public Node getNode(int index) {
		Node temp = head;
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public int getSize() {
		return size;
	}
	
//	private void displayRev(Node temp) {
//		if(temp.next == null) {
//			System.out.print(temp.value + "->");
//			return;
//		}
//		
//		displayRev(temp.next);
//		System.out.print(temp.value + "->");
//	}
//	
	
}
