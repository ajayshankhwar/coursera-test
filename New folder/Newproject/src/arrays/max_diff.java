package arrays;

import java.util.Scanner;

public class max_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<n;i++){
		        a[i] = sc.nextInt();
		    }
		    //code of sorting
		   for(int i=0;i<n;i++){
		       for(int j=i+1;j<n;j++){
		           if(a[i] > a[j]){
		               int temp = a[i];
		               a[i] = a[j];
		               a[j] = temp;
		           }
		       }
		   }
		   //code to find difference
		    int diff=0;
		    int maxDiff=0;
		    for(int i=0;i<n-1;i++){
//		        for(int j=i+1;j<n;j++){
		            diff = a[i+1]-a[i];
		            if(diff > maxDiff)
		            maxDiff = diff;
//		        }
		    }
		    System.out.println(maxDiff);
		}
		
	}

}
