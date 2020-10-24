package strings;
import java.util.*;
import java.lang.*;
import java.io.*;

class Substring {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
//		String empty = sc.hasNextLine();
		while(t > 0){
		    String s = sc.nextLine();
		    System.out.println();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    String str="";
		    str = s.substring(l,r);
		    System.out.println(str);
		}
		t--;
		System.out.println();
		sc.close();
	}
}