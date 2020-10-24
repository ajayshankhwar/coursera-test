package mathematics;

import java.util.Scanner;

public class Factorial {
	static int Fact(int n) {
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return Fact(n-1) * n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
//			System.out.println(Fact(n));
			int ans = Fact(n);
			System.out.println(ans);
			
		}

	}

}
