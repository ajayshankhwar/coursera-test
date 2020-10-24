import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		double total_Salary = 0;
        double hra = 0.0;
        double da ;
        int allow = 0;
        double basic = 0.0;
        
        double grade = ' ';
        double pf =0.0;
    	basic = sc.nextInt();
        char c = sc.next().charAt(0);
        hra = (20 * basic)/100;
        da = (50 * basic)/100;
        pf= (11*basic)/100;
        if(c == 'A'){
            allow = 1700;
        }
        else if(c=='B'){
            allow = 1500;
        }
        else 
            allow = 1300;
        
        total_Salary = basic + hra + da + allow -pf;
        total_Salary = Math.round(total_Salary);
        System.out.println(total_Salary);
	}
}
