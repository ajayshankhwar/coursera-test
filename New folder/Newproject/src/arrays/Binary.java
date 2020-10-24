package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the array elements");
		for(int i =0;i<size;i++) {
			a[i]= sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.print("sorted array");
		for(int i=0;i<size;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
