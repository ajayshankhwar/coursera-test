
public class QueueUsingLL<T> {
	
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLL(){
	front = null;
	rear = null;
	size = 0;	
}
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		if(front == rear) {
			return true;
		}
			else
			return	false;
		}
	
	T front() {
		
	}
	
	
	
	
	
	
}
