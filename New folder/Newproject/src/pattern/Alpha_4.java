package pattern;

import java.util.Scanner;

public class Alpha_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows=1;
        
        char jchar = (char)(n+64); 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(jchar);
                if(rows>1)
                	jchar++;
            }
            System.out.println();
            if(rows==1)
            jchar =(char)(jchar-rows);
            if(rows>1) {
            	jchar=(char)(jchar-rows-1);
            }
            rows++;
           
            
            
        }
	}
5
	}


