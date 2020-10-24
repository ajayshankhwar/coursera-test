package strings;

public class OperatorEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if(str1 == str2) {
			System.out.println("str1 == str2 is true"); }
		else
			System.out.println("str1 == str2 is false");
		
		if(str1.equals(str2)) {
			System.out.println("str1 == str2 is true");
		}
		else
			System.out.println("str1 == str2 is false");
	}
	
}
