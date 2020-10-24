package pattern;

import java.util.Scanner;

public class Alphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         char jchar = 'A' ; 
        
        for(int  i=1;i<=n;i++){
            int rows =i;
          
            for(int j=1;j<=n;j++){
               
                System.out.print(jchar);
                jchar= (char)(jchar +1);
            }
            System.out.println();
            jchar = (char)(jchar- (n-1)) ;
        }
	}

}
