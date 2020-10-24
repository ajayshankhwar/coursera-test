package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n =sc.nextInt();
		System.out.println("enter the position");
		int pos = sc.nextInt();
		System.out.println("enter the element to be inserted");
		int ele = sc.nextInt();
		int a[] = new int[n+1];
		System.out.println("the size of array is:" +a.length);
		System.out.println("enter elements of the array");
		for(int i =0;i<n;i++) {
			a[i] =sc.nextInt();
		}
//		int max = n;
		for(int i=n;i>pos;i--) {
			
			a[i] = a[i-1];
		}
		a[pos] = ele;
		 System.out.printf("Modified arr[] : %s", 
                 Arrays.toString(a));
	}

}
