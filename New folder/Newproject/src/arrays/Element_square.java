package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Element_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		
		int b[] = new int[n];
		for(int i=0;i<n;i++) {
			
			for(int j=i;j<=i;j++) {
				
				b[j] = a[i] * a[i];
			}
		}
		
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
