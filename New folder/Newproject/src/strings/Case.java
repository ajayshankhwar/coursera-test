package strings;

import java.util.Scanner;

public class Case {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			System.out.println("enter the string");
			String s = sc.nextLine();
			char ch[] = new char[s.length()];
			  for(int i=0;i<ch.length;i++) {
			        ch[i] = s.charAt(i); 
			    }
			  for(int i=0;i<ch.length;i++) 
			  {
				  while(i == 0) {
			if(s.charAt(0)>=65 && s.charAt(0)<= 90) {
				System.out.println(s.toUpperCase());
			}
			else if(s.charAt(0)>= 97 && s.charAt(0)<=122){
				System.out.println(s.toLowerCase());
			}
		}
	}
	
	
	}
}
}

