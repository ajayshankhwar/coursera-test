
public class NumberOne {
	public static int countSteps(int n) {
		if(n==1)
		{
			return 0;
	}
		int op1 = countSteps(n-1);
		int minSteps = op1;
		
		if(n%3==0)	{
			int op2 = countSteps(n/3);
			if(op2 < minSteps ) { 
			 minSteps = op2;	
		}
	}
		if(n%2 == 0) {
			int op3 = countSteps(n/2);
			if(op3 < minSteps)
			{
				minSteps = op3;
			}
		}
			
	return 1 + minSteps;	
}


	static int countStepsM(int n) {
		int storage[]= new int[n+1];
		return countStepsM(n, storage);
	}
	private static int countStepsM(int n, int[ ]storage)
	{
		if(n == 1)
		{
			storage[n] = 0;
			return storage[n];
			}
		if(storage[n] !=0) {
			return storage[n];
		}
		int op1 = countStepsM(n-1,storage);
		int minSteps = op1;
		
		if(n%3==0)	{
			int op2 = countStepsM(n/3,storage);
			if(op2 < minSteps ) { 
			 minSteps = op2;	
		}
	}
		if(n%2 == 0) {
			int op3 = countStepsM(n/2,storage);
			if(op3 < minSteps)
			{
				minSteps = op3;
			}
		}
		storage[n]= 1+ minSteps;
		return storage[n];
    }
	public static int countStepsDP(int n) {
		int storage[] = new int[n+1];
		storage[1]= 0;
		for(int i =2; i <= n ;i++ ) {
			int min = storage[i-1];
			if(i/3 == 0)
			{
				
			}
		}
	}
	public static void main(String args[])
	{
		int n = 100;
		System.out.println(countSteps(n));
		System.out.println(countStepsM(n));
	}
}
	
