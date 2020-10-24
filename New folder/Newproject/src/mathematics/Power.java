package mathematics;

import java.util.Scanner;

public class Power {

	
		// TODO Auto-generated method stub
		static boolean findPower(double n) {
			  if (n == 0) 
		            return false; 
		          
		        while (n != 1) 
		        { 
		            if (n % 2 != 0) 
		                return false; 
		            n = n / 2; 
		        } 
		        return true; 
			
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double n = sc.nextDouble();
		   if (findPower(n))
		        System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}

}
