package CustomStackImplementation;

public class CustomStack {
	protected int[] data;
	private static final int size = 10;
	int ptr = -1;
	
	public CustomStack() {
		this(size);
	}
	
	public CustomStack(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("Stack is Full");
			return false;
		}
		ptr++;
		data[ptr] = item;
		return true;
		
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		
		return data[ptr--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Cannot peek because Stack is Empty");
			return -1;
		}
		
		return data[ptr];
	}
	
	public void display() {
		for(int i = ptr; i>-1; i--) {
			System.out.println("| "+ data[i] + " |");
		}
	}
	
	public boolean isFull() {
		return ptr == data.length - 1;
	}
	
	public boolean isEmpty() {
		return ptr == -1;
	}
}
