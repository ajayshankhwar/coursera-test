package Generics;

public class arraylist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		List<String> l1 = new ArrayList();
		Pair1<String,Integer>  p1 = new Pair1("Ajay",23);
		Pair1<Double,Character> p2 = new Pair1(4.56,'A');
		Pair<Integer,String> p4 = new Pair(12,"Hello World");
		p1.getDiscription();
		p2.getDiscription();
		
	}

}
