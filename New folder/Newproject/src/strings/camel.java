package strings;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class camel {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String empty = sc.nextLine();
		
		while(t-- > 0){
		    
		    String s = sc.nextLine();
		    
		    char ch[] = new char[s.length()];
		    
		    for(int i=0;i<ch.length;i++){
		        ch[i] = s.charAt(i); 
		    }
		    int count = 0;
		    for(int i=0;i<ch.length;i++)
		    {
		        if(ch[i]>='A' && ch[i]<='Z'){
		            count++;
		        }
		        else {
		            continue;
		        }
		      
		    }
		     System.out.println(count);
		}
	}
}