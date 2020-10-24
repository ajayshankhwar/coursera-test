package strings;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aab";
		String s1 = "aac";
		boolean isAnagram = true;
		int a[] = new int[256];
		int b[] = new int[256];
		
		for(char c: s.toCharArray()) {
			 int index = (int)c;
			 a[index]++;
		}
		for(char c: s1.toCharArray()) {
			int index = (int)c;
			b[index]++; 
		}
		for(int i=0;i<256;i++) {
			if(a[i]!= b[i]) {
				break;
			}
		}
		if(isAnagram)
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

}
