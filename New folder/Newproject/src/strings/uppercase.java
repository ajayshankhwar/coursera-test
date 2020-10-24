package strings;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class uppercase {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    String a =sc.nextLine();
		    String b = sc.next();
		    
		    lowercase gfg = new lowercase();
		    gfg.print(a,b);
		    System.out.println();
		}
	}
}

class lowercase {
    public static void print(String a, String b){
        
        System.out.print(a.toLowerCase());
        System.out.print(b.toLowerCase());
    }
}