import java.util.Scanner;

public class power2 {
	 static int power(int N, int P) 
	  { 
	        if (N== 1||N>1 && P==0 || N==0 && P==0) 
	            return 1;
      if(N==0)
          return 0;
	        else
	            return N * power(N, P - 1); 
      
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
         Scanner sc = new Scanner(System.in);
	       int N= sc.nextInt();
         int P =sc.nextInt(); 
	  
	        System.out.println(power(N, P)); 
	    } 
	
}
  