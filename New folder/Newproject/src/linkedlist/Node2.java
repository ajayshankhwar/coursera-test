package linkedlist;

import java.util.Scanner;

public class Node2 {
	int data ;
	Node2 next;
	
	Node2(int x){
		data = x;
		next = null;
	}
	
	static class CFG{
		static void printList(Node2 node) {
			while(node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		int n = sc.nextInt();	
		Node2 head = new Node2(sc.nextInt());
		Node2 tail = head;
		for(int i=0;i<n-1;i++) {
			tail.next = new Node2(sc.nextInt());
			tail= tail.next;
		}
		Solution g = new Solution();
		int ans = g.	(head);
		System.out.println(ans);
		t--;
			
		}
		}
	}
	class Solution
	{
	    int getMiddle(Node head)
	    {
	        int count =0;
	        Node temp;
	        temp = head;
	         // Your code here.
	         if(temp == null){
	             return 0;
	         }
	         else
	         while(temp.next!= null){
	             head = head.next;
	             count++;
	         }
	         while(head.next!=)
	         if(count/2==0){
	             count= count/2;
	             
	            return count;
	         }
	         else
	            count = count/2;
	            count++;
	            return count;
	         
	    }

		public int getMiddle(Node2 head) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	
