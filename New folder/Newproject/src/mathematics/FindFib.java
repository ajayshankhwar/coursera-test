package mathematics;

import java.util.Scanner;

public class FindFib {
	static int FindFibb(int n) {
		if(n==1) {
			return 1;}
			else {
				return FindFibb(n-1) + FindFibb(n-2);
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			for(int i=0;i<=n-1;i++)
			FindFibb(n);
		}
	}

}
