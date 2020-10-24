package arrays;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int a[] = new int[n-1];
		System.out.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=1;i<=a.length;i++) {
			
			if((i)!=a[i]) {
					System.out.println("missing no is:" +i);
					}
					else 
					{
						continue;
						
				}
			
		}
	}

}
