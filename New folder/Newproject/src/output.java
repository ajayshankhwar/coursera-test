
public class output {
	
	static int methodOne(int i) {
		return methodTwo(i*=11);
	}
	static int methodTwo(int i) {
		return methodThree(i/=11);
	}
	static int methodThree(int i) {
		return methodFour(i -= 11);
	}
	static int methodFour(int i) {
		return i+=11;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(methodOne(11));
	}

}
