import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			System.out.print("Enter the node data");
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
			head= newNode;
			}	
			else {
				Node<Integer> temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		
		Node<Integer> temp = head;
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
//		head = temp;
//		while(head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		print(head);
	}
}
//		
//		Node<Integer> node1 = new Node<>(10);
//		Node<Integer> node2 = new Node<>(20);
//		Node<Integer> node3 = new Node<>(30);
//		node1.next = node2;	
//		node2.next = node3;
//		Node<Integer> head= node1;
//		
//		print(head);
//		print(head);
			
	
	









  