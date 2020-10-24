package linkedlist;

public class LinkedList {
	Node head;
	
	public void insert(int data) {
		
		Node Newnode = new Node();
		Newnode.data = data;
		Newnode.next = null;
		if(head == null) {
			head = Newnode;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next; 
			}
			temp.next = Newnode;
		}
	}
	
	public void show() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
