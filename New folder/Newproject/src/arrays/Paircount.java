package arrays;

import java.util.Scanner;

public class Paircount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int k = sc.nextInt();
		    for(int i=0;i<n;i++){
		        a[i] =sc.nextInt();
		    }
		    int pairCount =0;
		    for(int i=0;i<n;i++){
		        for(int j=i+1;j<n;j++){
		            if(j == i){
		                j++;
		            }
		                else if(a[j] + a[i] == k){
		                    pairCount++;
		                }
		            }
		    }
		    System.out.println("no. of pairs ="+pairCount);
		}
	}
}


