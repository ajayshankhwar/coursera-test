
public class Student {
	int rollNo;
	String name;
	static String college = "BIET";
	//constructor
	Student(int r,String n){
		rollNo = r;
		name = n;
		System.out.println(rollNo + " " + name + " " + college);
	}
//	void display() {
//		System.out.println(rollNo + " " + name + " " + college);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(212,"Vijay");
//		s1.display();
//		s2.display();
	}

}
