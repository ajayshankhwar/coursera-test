package arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		ArrayList<Integer> alist= new ArrayList<>(n);
	//Adding new element at the end of the arraylist
		for(int i=1;i<=n;i++) {
			alist.add(i);
		}
			System.out.println(alist);
		
		
		//remove element at index 3 
		alist.remove(3);
		System.out.println(alist);
		
		//Printing elements one by one
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i) + " ");
		}
	}

}
