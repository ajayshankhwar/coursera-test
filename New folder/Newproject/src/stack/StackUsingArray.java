package stack;

public class StackUsingArray {
	private	int data[] = new int[10];
	private	int top = -1;
	private int size;
	private int elem;
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}

	public StackUsingArray(int capacity) {
		
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty(){
		
		if(top == -1) {
			return true;
		}
		else { 
			return false;
		}
	}
	public int size() throws StackEmptyException {
		if(size == 0) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException {
		
		if(size == data.length) {
			StackFullException e = new StackFullException();
			throw e;
		}
			top++;
			data[top] = elem;
		}
	
	public int pop() throws StackEmptyException {
		if(size() == 0) {
			StackEmptyException e = new StackEmptyException();
		}
		int temp = data[top];
		top--;
		return temp;
	
	}
	
	public static void main(String[] args) throws StackFullException {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		
		for(int i=1;i<=5;i++) {
			stack.push(i);
		
		while(!stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			}
			catch(StackEmptyException e){
				
			}
		}
	}

}
}
