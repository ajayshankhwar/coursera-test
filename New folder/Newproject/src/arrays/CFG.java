package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class CFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements");
		for( int i=0;i<n;i++){
		    a[i] = sc.nextInt();	
		    }
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
		System.out.print(a[i] + " ");
	}
}
}
