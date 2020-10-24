import java.util.Scanner;
public class sum_Even_Odd {

		
		public static void main(String[] args) {
			// Write your code here
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int temp=0;
	        int sum_Odd=0;
	        int sum_Even=0;
	        temp=n;
	        while(temp!=0){
			int rem = temp%10;
	        if(rem%2==0){
	            sum_Even = rem + sum_Even;
	            
	        }
	            else if(rem%2!=0) {
	            sum_Odd = rem+ sum_Odd;
	            }
	        temp = temp/10;
	        }
	        System.out.print(sum_Even + " " + sum_Odd);
		}
	}
