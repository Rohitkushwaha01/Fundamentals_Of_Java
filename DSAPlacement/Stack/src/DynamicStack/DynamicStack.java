package DynamicStack;

public class DynamicStack {
	protected int[] data;
	private static final int size = 10;
	
	int ptr = -1;
	
	public DynamicStack() {
		this(size);
	}
	
	public DynamicStack(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			int[] temp = new int[size * 2];
			
			for(int i = 0; i<data.length; i++) {
				temp[i] = data[i];
			}
			
			data = temp;
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
			System.out.println("Cannot peek because stack is Empty");
			return -1;
		}
		
		return data[ptr];
	}
	
	public void display() {
		for(int i = ptr; i>-1; i--) {
			System.out.println("| " + data[i] + " |");
		}
	}
	
	public boolean isFull() {
		return ptr == data.length - 1;
	}
	
	public boolean isEmpty() {
		return ptr == -1;
	}
	
}
