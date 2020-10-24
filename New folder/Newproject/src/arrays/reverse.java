package arrays;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ebter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		n=a.length;
		System.out.println(+n);
		System.out.println("enter the elements of the array");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int temp = a[i];
			a[i] = a[n-i-1];
			a[n-i-1]= temp;
		}
		System.out.println("array after reverse");
		for(int i=0;i<n;i++) {
			System.out.println(a[i] + " ");
		}
	}
}
