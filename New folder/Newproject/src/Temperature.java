	import java.util.Scanner;
	public class Temperature {
		public static void main(String[] args) {
			
			/* Your class should be named Solution.
		 	* Read input as specified in the question.
		 	* Print output as specified in the question.
			*/
			Scanner sc = new Scanner(System.in);
	       
	        int start = sc.nextInt();
	        int end =sc.nextInt();
	        int gap=sc.nextInt();
			double tempC;
			int temp;
	        
	        for(int i=start; i<=end;i--)
	        {
	            tempC = (i-32)*(0.55);
	            temp = (int)tempC;
	            
	            System.out.print(i +"\t" + temp);
	            System.out.println();
	            i=i+1+gap;
	            
	        }
		}

	}


