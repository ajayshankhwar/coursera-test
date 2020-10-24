package pattern;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int value =0; 
		
		for(int i=0;i<rows;i++) {
			for(int s=0;s<(rows-i-1);s++) {
			System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				value = BinomialC(i,j);
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
		static int BinomialC(int line, int col) {
			if(col ==0 || line == col) {
				return 1;
			}
				else 
				{
					return BinomialC(line-1, col-1) + BinomialC(line-1,col);
				}
			}
			
	}


