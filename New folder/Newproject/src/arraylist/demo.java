package arraylist;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alist = new ArrayList<>();
		System.out.println(alist.size());
		alist.add(20);
		alist.add(50);
		alist.add(2);
		alist.add(23);
		alist.add(21);
		alist.add(45);
		alist.add(3,65); 
		alist.set(0,9);
		System.out.println(alist);
//		for(int i=0;i<alist.size();i++) {
//			System.out.println(alist);
//		}
		System.out.println(alist.get(1));
//		System.out.println(alist);
	}

}
