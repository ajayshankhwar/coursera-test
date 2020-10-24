package arrays;

import java.util.Scanner;

public class print {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the size");
		int n = sc.nextInt();
		int a[] = new int[n];
//		n = a.length;
		
		for(int i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			
			System.out.println(" the array elements are :" +a[i]);
		}
	}

}
