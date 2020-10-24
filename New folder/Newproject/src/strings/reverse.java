package strings;

import java.util.Scanner;

public class reverse {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i=(s.length()-1);i>=0;i--) {
			char a = s.charAt(i);
			System.out.print(a);
		}
		
	}

}
