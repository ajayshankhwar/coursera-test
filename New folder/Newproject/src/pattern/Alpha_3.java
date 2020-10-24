package pattern;

import java.util.Scanner;

public class Alpha_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         char jchar = 'A' ; 
         int rows =1;
        for(int  i=1;i<=n;i++){
         
          
            for(int j=1;j<=i;j++){
               if(rows==2) {
            	   jchar++;
               }
                System.out.print(jchar);
                 if(rows>2) {
                	jchar++;
                }
               
            }
            System.out.println();
            if(rows>2) {
            	jchar = (char)(jchar -rows + 1);
            }
            rows++;
            
        
          }
       }
	}


