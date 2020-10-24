package pattern;
import java.util.Scanner;
public class pat_alphabet1 {
	
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
         char jchar = 'A' ; 
        
        for(int  i=1;i<=n;i++){
            int rows =i;
          
            for(int j=1;j<=i;j++){
               
                System.out.print(jchar);
            }
            System.out.println();
            jchar = (char)('A'+ rows) ;
        }
		
	}
}
