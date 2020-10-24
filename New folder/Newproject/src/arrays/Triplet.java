package arrays;

public class Triplet {
	static void triple(int a[], int f, int s, int c) {
		
		for(int i=1;i>=1;i++) {
			
			if((f+s) == c) {
			 print(f,s,c);	
			break;
			}
			else if(c>=a.length) {
				f++;
				s = f+1;
				c=s;
			}
			c++;
			s++;
		}
		
	}
	
	static void print(int f, int s, int c) {
		System.out.println("trplet found");
		System.out.println(+f + "+" + +s + "=" +c );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,12,48,1,13};
		Triplet t = new Triplet();
		int f = a[0];
		int s = a[1];
		int c = a[2];
		t.triple(a,f,s,c);
		t.print(f, s, c);
	}

}
