package strings;

import java.util.Scanner;

public class concate {
	 static String s3;
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string s1");
		String s1 = sc.nextLine();
		System.out.println("enter string s2");
		String s2 = sc.nextLine();
		concatenate(s1,s2);
		print();
		
	}
		 static String concatenate(String s1, String s2) {
			
		 s3 = s1.concat(s2);
		return s3;
		
	}
		static void print() {
			System.out.println(s3);
		}
		
}
