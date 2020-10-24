package arrays;

import java.util.Scanner;

public class productarraypuzzle {
	public static void productarray(int a[], int n) {
		int product[] = new int[n];
		int prod=1;
		int index=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j!=i) {
				prod = prod *a[j];	
				}
			}
			product[index] = prod;
			index++;
			prod=1;
		}
		for(int i=0;i<n;i++)
		System.out.print(product[i] + " ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++) {
				a[i] =sc.nextInt();
			}
			productarray(a,n);
			
		}
	}

}
