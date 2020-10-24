
public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray();
		for (int i = 1; i <=5; i++) {
			try {
				queue.enqueue(i);
				
			} catch (QueueFullException e) {
		}
		
	}
		while(! queue.isEmpty()) {
			System.out.println(queue.dequeue());
}
}
}