package mathematics;

import java.util.*;
import java.lang.*;
import java.io.*;

class samplespace {
    public static void squareset(int n){
        
        int a[] = new int[n];
        for(int i=1;i<n/2;i++){
            a[i] = (int)Math.pow(i,2);
        }
        int count =0;
        for(int i=1;i<(int)Math.sqrt(n);i++){
        	
        	if(a[i]< n)
            count++;
           
        }
        System.out.println(count);
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    squareset(n);
		    }
		}
	}
