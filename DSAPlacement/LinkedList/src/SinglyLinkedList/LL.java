package SinglyLinkedList;


public class LL {
	
	// Node: contains value + next;
	private class Node{
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
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	public void insert(int val, int index) {
		if(index == 0 || tail == null) {
			insertFirst(val);
			return;
		}
		if(index == size) {
			insertLast(val);
			return;
		}
		
		Node node = new Node(val);
		
		
		Node prevNode = get(index - 1);
		Node currentNode = get(index);
		prevNode.next = node;
		node.next = currentNode;
		size++;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) tail = head;
		size++;
	} 
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		
		head = head.next;
		
		if(head==null) tail = null;
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size<1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	public int delete(int index) {
		if(index == 0)return deleteFirst();
		if(index == size) return deleteLast();
		Node node = get(index);
		Node prevNode = get(index - 1);
		Node nextNode = get(index + 1);
		prevNode.next = nextNode;
		return node.value;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public Node get(int index) {
		Node node = head;
		for(int i = 0; i<index; i++) {
			node = node.next;
		}
		return node;
	}
}
