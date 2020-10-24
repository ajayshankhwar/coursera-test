package arrays;

public class bubble {
	
	public static void main(String args[]) {
		int a[] = {15,7,11,2,9,3};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
