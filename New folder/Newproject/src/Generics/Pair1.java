package Generics;

public class Pair1<X,Y> {
	X x;
	Y y;

public Pair1(X x , Y y) {
	this.x = x;
	this.y = y;
}

public void getDiscription() {
	System.out.println(x + "and" + y);
}
}