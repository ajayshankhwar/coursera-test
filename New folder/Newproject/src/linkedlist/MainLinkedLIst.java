package linkedlist;

import java.util.*;

public class MainLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List--<data type>---<list variable initialisation>--- = new (Name of DS)<>()
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		getTimeDiff(al);
		getTimeDiff(ll);
		
	}
	
	static void getTimeDiff(List <Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.get(4));
		list.remove(4);
		System.out.println(list.get(4));
		System.out.println(list.getClass().getName() + "-->" + (end-start));
	}
	

}
