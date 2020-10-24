package Inheritance;

public class Mainclass {
	public static void main(String args[]) {
		teacher t = new teacher();
		t.name = "Harry";
		t.eat();
		t.teach();
		t.walk();
		
		singer s = new singer();
		s.name="Arijit Singh";
		s.sing();
	}
}
