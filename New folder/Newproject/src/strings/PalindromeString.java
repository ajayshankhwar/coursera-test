package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		String rev="";
		
		for(int i =0;i<s.length();i++) {
			
			char ch= s.charAt(i);
			rev = rev + ch;
		}
		if(s.equals(rev)) {
			System.out.println("palindromic string");
		}
		else 
		{
			System.out.println("not palindrome string");
		}

	}

}
