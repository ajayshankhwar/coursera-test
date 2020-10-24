package strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aab ";
		String b = "aac ";
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
			for(int i=0;i<a.length();i++) {
				char ch= a.charAt(i);
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j) == ch && !visited[j]) {
					visited[j] = true;
			    isAnagram = true;
				break;
			}
		}
				
		if(!isAnagram) {
				break;
		    }
		}
	}	
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else
			System.out.println("not Anagram");
	}

}
