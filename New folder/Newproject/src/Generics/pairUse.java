package Generics;

public class pairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	pair<String,String> p = new pair<String,String>("ab","cd");
	p.setFirst("def");
	String s = p.getFirst();
	System.out.println(s);
		
	pair<Integer,String> p1 = new pair<Integer,String>(1,"temp");
	pair <Character,Character> p2 = new pair<Character,Character>('a','c');
	int a = 10;
	int b = 12;
	int c = 23;
	
	pair<Integer,Integer> internalPair = new pair<Integer,Integer>(a,b);
	pair<pair<Integer,Integer>,Integer> p3 = new pair<>(internalPair,c);
	
	System.out.println(p3.getSecond());
	System.out.println(p3.getFirst().getSecond());
	System.out.println(p3.getFirst().getFirst());
}
}
