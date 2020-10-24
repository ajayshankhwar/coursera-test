
public class SumNaturalNumbers {
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return sum(n-1) + n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		System.out.println("the sum of natural numbers upto n ="+sum(3));
	}

}
